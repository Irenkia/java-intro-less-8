package org.example.currency.usd;

public interface RateUSD {
    double sellUSD(double amountUsd);

    double buyUSD(double amountPln);
}
