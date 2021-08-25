package com.company;

public class Account {
    private boolean activeCard;
    private Integer availableLimit;

    public Account(boolean activeCard, Integer availableLimit) {
        this.activeCard = activeCard;
        this.availableLimit = availableLimit;
    }

    public Account() {

    }

    public boolean isActiveCard() {
        return activeCard;
    }

    public void setActiveCard(boolean activeCard) {
        this.activeCard = activeCard;
    }

    public int getAvailableLimit() {
        return availableLimit;
    }

    public void setAvailableLimit(int availableLimit) {
        this.availableLimit = availableLimit;
    }

    @Override
    public String toString() {
        return "Account{" +
                "activeCard=" + activeCard +
                ", availableLimit=" + availableLimit +
                '}';
    }
}
