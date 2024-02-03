package org.example.eur;

import org.example.Currency;

public class ExchangeRateEUR {
    double eurSell;
    double eurBuy;

    public ExchangeRateEUR() {
    }

    public ExchangeRateEUR(double eurSell, double eurBuy) {
        this.eurSell = eurSell;
        this.eurBuy = eurBuy;
    }

    public double getEurSell() {
        return eurSell;
    }

    public void setEurSell(double eurSell) {
        this.eurSell = Currency.EUR.getSell();
    }

    public double getEurBuy() {
        return eurBuy;
    }

    public void setEurBuy(double eurBuy) {
        this.eurBuy = Currency.EUR.getSell();
    }

}
