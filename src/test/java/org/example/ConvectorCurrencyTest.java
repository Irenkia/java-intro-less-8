package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ConvectorCurrencyTest {
    @Test
    public void testSellEUR() {
        ConvectorCurrency convectorCurrency = Mockito.mock(ConvectorCurrency.class);

        double amountEur = 100.0;
        double rateSellEur = 3.9558;
        double expected = 395.58;

        when(convectorCurrency.sellEUR(amountEur, rateSellEur)).thenReturn(expected);
        double actual = convectorCurrency.sellEUR(amountEur, rateSellEur);

        assertEquals(expected, actual);
    }

    @Test
    public void testBuyEUR() {
        ConvectorCurrency convectorCurrency = Mockito.mock(ConvectorCurrency.class);

        double amountPln = 100.0;
        double rateBuyEur = 4.0358;
        double expected = 403.58;

        when(convectorCurrency.buyEUR(amountPln, rateBuyEur)).thenReturn(expected);
        double actual = convectorCurrency.buyEUR(amountPln, rateBuyEur);

        assertEquals(expected, actual);
    }

    @Test
    public void testSellUSD() {
        ConvectorCurrency convectorCurrency = Mockito.mock(ConvectorCurrency.class);

        double amountUsd = 100.0;
        double rateSellUsd = 4.2829;
        double expected = 428.29;

        when(convectorCurrency.sellUSD(amountUsd, rateSellUsd)).thenReturn(expected);
        double actual = convectorCurrency.sellUSD(amountUsd, rateSellUsd);

        assertEquals(expected, actual);
    }

    @Test
    public void testBuyUSD() {
        ConvectorCurrency convectorCurrency = Mockito.mock(ConvectorCurrency.class);

        double amountPln = 100.0;
        double rateBuyUsd = 4.3695;
        double expected = 436.95;

        when(convectorCurrency.buyUSD(amountPln, rateBuyUsd)).thenReturn(expected);
        double actual = convectorCurrency.buyUSD(amountPln, rateBuyUsd);

        assertEquals(expected, actual);
    }

    @Test
    public void testSellGBR() {
        ConvectorCurrency convectorCurrency = Mockito.mock(ConvectorCurrency.class);

        double amountUsd = 100.0;
        double rateSellGbr = 5.0105;
        double expected = 501.05;

        when(convectorCurrency.sellGBR(amountUsd, rateSellGbr)).thenReturn(expected);
        double actual = convectorCurrency.sellGBR(amountUsd, rateSellGbr);

        assertEquals(expected, actual);
    }

    @Test
    public void testBuyGBR() {
        ConvectorCurrency convectorCurrency = Mockito.mock(ConvectorCurrency.class);

        double amountPln = 100.0;
        double rateBuyGbr = 5.1117;
        double expected = 511.17;

        when(convectorCurrency.buyGBR(amountPln, rateBuyGbr)).thenReturn(expected);
        double actual = convectorCurrency.buyGBR(amountPln, rateBuyGbr);

        assertEquals(expected, actual);
    }
  
}