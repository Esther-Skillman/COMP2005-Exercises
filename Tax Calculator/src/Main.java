public class Main {

    public static double taxThreshold20p = 12570;
    public static double taxThreshold40p = 50270;
    public static int taxThreshold45p = 125140;

    public static double taxBand20p = (taxThreshold40p - taxThreshold20p) * 0.8 + taxThreshold20p;
    public static double taxBand40p = (taxThreshold45p - taxThreshold40p) * 0.6 + taxBand20p;


    static double taxCalculator(double income){
        double newIncome = 0;

        if (income <= taxThreshold20p) {
            return income;
        }
        else if (income <= taxBand40p) {
            newIncome = (income - taxThreshold20p) * 0.8;
            newIncome += taxThreshold20p;
            return newIncome;
        }
        else if (income <= taxThreshold45p) {
            newIncome = (income - taxThreshold40p) * 0.6;
            newIncome += taxBand20p;
            return newIncome;
        }
        else if (income > taxThreshold45p) {
            newIncome = (income - taxThreshold45p) * 0.55;
            newIncome += taxBand40p;
            return newIncome;
        }
        return 0;
    }

    public static void main(String[] args) {
        double income = 30000;
        double result = taxCalculator(income);
        double incomeTax = income - result;

        // System.out.println("Taxed amount of 40% between 50270 and 125140 " + taxBand40p);
        // System.out.println("Total tax " + incomeTax);
        System.out.println("Result after income tax reductions " + result);

    }
}