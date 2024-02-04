package org.example;

public class ConvectorCurrency implements RateEUR, RateUSD, RateGBR{

    @Override
    public double sellEUR(double amountEur, double rateSellEur) {
        double eurSell = Currency.EUR.getSell();
        return amountEur * eurSell;
    }

    @Override
    public double buyEUR(double amountPln, double rateBuyEur) {
        double eurBuy = Currency.EUR.getBuy();
        return amountPln * eurBuy;
    }

    @Override
    public double sellUSD(double amountUsd, double rateSellUsd) {
        double usdSell = Currency.USD.getSell();
        return amountUsd * usdSell;
    }

    @Override
    public double buyUSD(double amountPln, double rateBuyUsd) {
        double usdBuy = Currency.USD.getBuy();
        return amountPln * usdBuy;
    }

    @Override
    public double sellGBR(double amountGbr, double rateSellGbr) {
        double gbrSell = Currency.GBP.getSell();
        return amountGbr * gbrSell;
    }

    @Override
    public double buyGBR(double amountPln, double rateBuyGbr) {
        double gbrBuy = Currency.GBP.getBuy();
        return amountPln * gbrBuy;
    }
}
