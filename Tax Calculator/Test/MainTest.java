import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MainTest {

    @Test
    public void testTaxCalculatorUnder() {
        double income = 10000;
        double result = Main.taxCalculator(income);
        assertEquals(result, 10000);
    }

    @Test
    public void testTaxCalculator20p() {
        double income = 13000;
        double result = Main.taxCalculator(income);
        assertEquals(result, 12914);
    }
}