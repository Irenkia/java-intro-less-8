package org.example.currency.gbr;

import org.example.currency.Currency;

public class ExchangeRateGBR {
    double gbrSell;
    double gbrBuy;

    public ExchangeRateGBR() {
    }

    public ExchangeRateGBR(double gbrSell, double gbrBuy) {
        this.gbrSell = gbrSell;
        this.gbrBuy = gbrBuy;
    }

    public double getGbrSell() {
        return gbrSell;
    }

    public void setGbrSell(double gbrSell) {
        this.gbrSell = Currency.GBP.getSell();
    }

    public double getGbrBuy() {
        return gbrBuy;
    }

    public void setGbrBuy(double gbrBuy) {
        this.gbrBuy = Currency.GBP.getBuy();
    }
}
