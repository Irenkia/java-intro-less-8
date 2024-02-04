package org.example;

public interface RateEUR {
    double sellEUR(double amountEur, double rateSellEur);

    double buyEUR(double amountPln, double rateBuyEur);
}
