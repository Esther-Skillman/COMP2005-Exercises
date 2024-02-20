import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TaxCalculatorTest {

    @Test
    public void testTaxCalculatorNegative() {
        double income = -1000;
        double tax = TaxCalculator.incomeTaxCalulator(income);
        assertEquals(tax, 0);
    }

    @Test
    public void testTaxCalculatorUnder() {
        double income = 10000;
        double tax = TaxCalculator.incomeTaxCalulator(income);
        assertEquals(tax, 0);
    }

    @Test
    public void testTaxCalculator20Boundary() {
        double income = 12570;
        double tax = TaxCalculator.incomeTaxCalulator(income);
        assertEquals(tax, 0);
    }

    @Test
    public void testTaxCalculator20p() {
        double income = 40000;
        double tax = TaxCalculator.incomeTaxCalulator(income);
        assertEquals(tax, 5486);
    }

    @Test
    public void testTaxCalculator40Boundary() {
        double income = 50270;
        double tax = TaxCalculator.incomeTaxCalulator(income);
        assertEquals(tax, 7540);
    }

    @Test
    public void testTaxCalculator40p() {
        double income = 60000;
        double tax = TaxCalculator.incomeTaxCalulator(income);
        assertEquals(tax, 11432);
    }

    @Test
    public void testTaxCalculator45Boundary() {
        double income = 125140;
        double tax = TaxCalculator.incomeTaxCalulator(income);
        assertEquals(tax, 37488);
    }

    @Test
    public void testTaxCalculator45p() {
        double income = 140000;
        double tax = TaxCalculator.incomeTaxCalulator(income);
        assertEquals(tax, 44175);
    }

    @Test
    public void testTaxCalculatorLongDecimal() {
        double income = 134678.175869;
        double tax = TaxCalculator.incomeTaxCalulator(income);
        assertEquals(tax, 41780.17914105);
    }


}