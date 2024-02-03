package org.example;

public enum Currency {
    EUR(3.9558, 4.0358),
    USD(4.2829, 4.3695),
    GBP(5.0105, 5.1117);

    private double sell;
    private double buy;

    Currency(double sell, double buy) {
        this.sell = sell;
        this.buy = buy;
    }

    public double getSell() {
        return sell;
    }

    public void setSell(double sell) {
        this.sell = sell;
    }

    public double getBuy() {
        return buy;
    }

    public void setBuy(double buy) {
        this.buy = buy;
    }
}
