public class TaxCalculator {
    public static double taxThreshold20p = 12570;
    public static double taxThreshold40p = 50270;
    public static double taxThreshold45p = 125140;

    // taxBand20p = 7540
    public static double taxBand20p = (taxThreshold40p - taxThreshold20p) * 0.2;

    // taxBand40p = 29948
    public static double taxBand40p = (taxThreshold45p - taxThreshold40p) * 0.4;

    // taxBand40p + taxBand20p = 37488


    static double incomeTaxCalulator(double income){
        double tax = 0;

        if (income <= taxThreshold20p) {
            return tax;
        }
        else if (income <= taxThreshold40p) {
            tax = (income - taxThreshold20p) * 0.2;
            return tax;
        }
        else if (income <= taxThreshold45p) {
            tax = (income - taxThreshold40p) * 0.4;
            tax += taxBand20p;
            return tax;
        }
        else if (income > taxThreshold45p) {
            tax = (income - taxThreshold45p) * 0.45;
            tax += taxBand20p + taxBand40p;
            return tax;
        }
        return 0;
    }


    public static void main(String[] args) {
        double income = 12000;
        double incomeTax = incomeTaxCalulator(income);
        double incomeAfterTax = income - incomeTax;

        // System.out.println("Taxed amount of 40% between 50270 and 125140 " + taxBand40p);
        System.out.println("Total tax " + incomeTax);
        System.out.println("Result after income tax reductions " + incomeAfterTax);

    }
}
