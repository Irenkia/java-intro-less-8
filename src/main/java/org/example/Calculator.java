package org.example;

public class Calculator implements PayBasicSalary, PayBonusSalary {
    private double basicSalary;
    private double bonusSalary;
    private double additional;
    private double numberOfSaturdays;

    public Calculator() {
    }

    public Calculator(double basicSalary, double bonusSalary, double additional, double numberOfSaturdays) {
        this.basicSalary = basicSalary;
        this.bonusSalary = bonusSalary;
        this.additional = additional;
        this.numberOfSaturdays = numberOfSaturdays;
    }

    public double calculatingSalary(double basicSalary, double additional, double bonusSalary, double numberOfSaturdays) {
        double basic = getBasicSalary(basicSalary, bonusSalary);
        double add = getPayBonusSalary(additional, numberOfSaturdays);
        return basic + add;
    }


    @Override
    public double getBasicSalary(double basicSalary, double bonusSalary) {
        return basicSalary + bonusSalary;
    }

    @Override
    public double getPayBonusSalary(double additional, double numberOfSaturdays) {
        return additional * numberOfSaturdays;
    }
}
