package org.example;

import org.example.eur.ExchangeRateEUR;
import org.example.eur.RateEUR;
import org.example.gbr.ExchangeRateGBR;
import org.example.gbr.RateGBR;
import org.example.usd.ExchangeRateUSD;
import org.example.usd.RateUSD;

public class ConvectorCurrency implements RateEUR, RateUSD, RateGBR {
    ExchangeRateEUR exchangeRateEUR;
    ExchangeRateUSD exchangeRateUSD;
    ExchangeRateGBR exchangeRateGBR;

    public ConvectorCurrency() {
    }

    public ConvectorCurrency(ExchangeRateEUR exchangeRateEUR) {
        this.exchangeRateEUR = exchangeRateEUR;
    }

    public ConvectorCurrency(ExchangeRateUSD exchangeRateUSD) {
        this.exchangeRateUSD = exchangeRateUSD;
    }

    public ConvectorCurrency(ExchangeRateGBR exchangeRateGBR) {
        this.exchangeRateGBR = exchangeRateGBR;
    }

    @Override
    public double sellEUR(double amountEur) {
        return exchangeRateEUR.getEurSell() * amountEur;
    }

    @Override
    public double buyEUR(double amountPln) {
        return exchangeRateEUR.getEurBuy() * amountPln;
    }


    @Override
    public double sellUSD(double amountUsd) {
        return exchangeRateUSD.getUsdSell() * amountUsd;
    }

    @Override
    public double buyUSD(double amountPln) {
        return exchangeRateUSD.getUsdBuy() * amountPln;
    }

    @Override
    public double sellGBR(double amountGbr) {
        return exchangeRateGBR.getGbrSell() * amountGbr;
    }

    @Override
    public double buyGBR(double amountPln) {
        return exchangeRateGBR.getGbrBuy() * amountPln;
    }
}
