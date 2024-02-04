package org.example;

public interface RateUSD {
    double sellUSD(double amountUsd, double rateSellUsd);

    double buyUSD(double amountPln, double rateBuyUsd);
}
