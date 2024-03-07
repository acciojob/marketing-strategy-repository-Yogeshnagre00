package com.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MarketingStrategyManager {
    private List<MarketingStrategy> strategies;

    public MarketingStrategyManager() {
        this.strategies = new ArrayList<>();
    }

    public void createStrategy(MarketingStrategy strategy) {
        strategies.add(strategy);
    }

    public MarketingStrategy getStrategyByName(String name) {
        return strategies.stream()
                .filter(strategy -> strategy.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public void updateStrategy(MarketingStrategy updatedStrategy) {
        for (int i = 0; i < strategies.size(); i++) {
            MarketingStrategy strategy = strategies.get(i);
            if (strategy.getName().equals(updatedStrategy.getName())) {
                strategies.set(i, updatedStrategy);
                break;
            }
        }
    }

    public void deleteStrategy(String name) {
        strategies.removeIf(strategy -> strategy.getName().equals(name));
    }

    public List<MarketingStrategy> getStrategiesInBudgetRange(double minBudget, double maxBudget) {
        return strategies.stream()
                .filter(strategy -> strategy.getBudget() >= minBudget && strategy.getBudget() <= maxBudget)
                .collect(Collectors.toList());
    }

    public List<MarketingStrategy> getAllStrategies() {
        return new ArrayList<>(strategies);
    }
}
