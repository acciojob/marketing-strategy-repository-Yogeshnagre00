package com.driver;

public class MarketingStrategy {
    private String name;
    private String description;
    private String targetAudience;
    private double budget;
    private double potentialROI;

    public MarketingStrategy(String name, String description, String targetAudience, double budget, double potentialROI) {
        this.name = name;
        this.description = description;
        this.targetAudience = targetAudience;
        this.budget = budget;
        this.potentialROI = potentialROI;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getPotentialROI() {
        return potentialROI;
    }

    public void setPotentialROI(double potentialROI) {
        this.potentialROI = potentialROI;
    }

    @Override
    public String toString() {
        return "MarketingStrategy{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", targetAudience='" + targetAudience + '\'' +
                ", budget=" + budget +
                ", potentialROI=" + potentialROI +
                '}';
    }
}
