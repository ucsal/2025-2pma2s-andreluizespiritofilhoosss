package br.com.mariojp.solid.srp;

public class TaxCalculator {
    private final double taxRate;

    public TaxCalculator() {

        this.taxRate = Double.parseDouble(System.getProperty("tax.rate", "0.10"));
    }

    public double calculateTax(double amount) {
        return amount * taxRate;
    }
}
