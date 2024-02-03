package org.example;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class ConvectorCurrencyTest {

    @Test
    public void testSellEUR() {
        ConvectorCurrency convectorCurrency = Mockito.mock(ConvectorCurrency.class);

        double amountEur = 100.0;
        double expected = 395.58;

        when(convectorCurrency.sellEUR(amountEur)).thenReturn(expected);
        double actual = convectorCurrency.sellEUR(amountEur);

        assertEquals(expected, actual);
    }

    @Test
    public void testBuyEUR() {
        ConvectorCurrency convectorCurrency = Mockito.mock(ConvectorCurrency.class);

        double amountPln = 100.0;
        double expected = 403.58;

        when(convectorCurrency.buyEUR(amountPln)).thenReturn(expected);
        double actual = convectorCurrency.buyEUR(amountPln);

        assertEquals(expected, actual);
    }

    @Test
    public void testSellUSD() {
        ConvectorCurrency convectorCurrency = Mockito.mock(ConvectorCurrency.class);

        double amountUsd = 100.0;
        double expected = 428.29;

        when(convectorCurrency.sellUSD(amountUsd)).thenReturn(expected);
        double actual = convectorCurrency.sellUSD(amountUsd);

        assertEquals(expected, actual);
    }

    @Test
    public void testBuyUSD() {
        ConvectorCurrency convectorCurrency = Mockito.mock(ConvectorCurrency.class);

        double amountPln = 100.0;
        double expected = 436.95;

        when(convectorCurrency.buyUSD(amountPln)).thenReturn(expected);
        double actual = convectorCurrency.buyUSD(amountPln);

        assertEquals(expected, actual);
    }

    @Test
    public void testSellGBR() {
        ConvectorCurrency convectorCurrency = Mockito.mock(ConvectorCurrency.class);

        double amountUsd = 100.0;
        double expected = 501.05;

        when(convectorCurrency.sellGBR(amountUsd)).thenReturn(expected);
        double actual = convectorCurrency.sellGBR(amountUsd);

        assertEquals(expected, actual);
    }

    @Test
    public void testBuyGBR() {
        ConvectorCurrency convectorCurrency = Mockito.mock(ConvectorCurrency.class);

        double amountPln = 100.0;
        double expected = 511.17;

        when(convectorCurrency.buyGBR(amountPln)).thenReturn(expected);
        double actual = convectorCurrency.buyGBR(amountPln);

        assertEquals(expected, actual);
    }
}
