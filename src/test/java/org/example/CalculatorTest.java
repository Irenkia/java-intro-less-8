package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CalculatorTest {
    @Test
    public void testCalculatingSalary() {
        Calculator calculator = Mockito.mock(Calculator.class);

        double basicSalary = 3000.0;
        double bonusSalary = 500.0;
        double additional = 100.0;
        double numberOfSaturdays = 3.0;
        double expected = 3800.00;

        when(calculator.calculatingSalary(basicSalary, bonusSalary, additional, numberOfSaturdays)).thenReturn(expected);
        double actual = calculator.calculatingSalary(basicSalary, bonusSalary, additional, numberOfSaturdays);

        assertEquals(expected, actual);
    }

    @Test
    public void mustGetBasicSalary() {
        Calculator calculator = Mockito.mock(Calculator.class);

        double basicSalary = 3000.0;
        double bonusSalary = 500.0;
        double expected = 3500.00;

        when(calculator.getBasicSalary(basicSalary, bonusSalary)).thenReturn(expected);
        double actual = calculator.getBasicSalary(basicSalary, bonusSalary);

        assertEquals(expected, actual);
    }

    @Test
    public void mustGetPayBonusSalary() {
        Calculator calculator = Mockito.mock(Calculator.class);

        double additional = 100.0;
        double numberOfSaturdays = 3.0;
        double expected = 300.00;

        when(calculator.getPayBonusSalary(additional, numberOfSaturdays)).thenReturn(expected);
        double actual = calculator.getPayBonusSalary(additional, numberOfSaturdays);

        assertEquals(expected, actual);
    }

}
