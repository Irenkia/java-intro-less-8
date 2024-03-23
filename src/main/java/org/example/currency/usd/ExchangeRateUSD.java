package org.example.currency.usd;

import org.example.currency.Currency;

public class ExchangeRateUSD {
    double usdSell;
    double usdBuy;

    public ExchangeRateUSD() {
    }

    public ExchangeRateUSD(double usdSell, double usdBuy) {
        this.usdSell = usdSell;
        this.usdBuy = usdBuy;
    }

    public double getUsdSell() {
        return usdSell;
    }

    public void setUsdSell(double usdSell) {
        this.usdSell = Currency.USD.getSell();
    }

    public double getUsdBuy() {
        return usdBuy;
    }

    public void setUsdBuy(double usdBuy) {
        this.usdBuy = Currency.USD.getBuy();
    }
}
