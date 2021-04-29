import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {

    private CustomCalculator customCalculator;

    //더하기 테스트 진행
    @Test
    public void addTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10, 10);

        assertTrue(result == 20);
    }

    @Test
    public void subtract() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(10, 10);

        assertTrue(result == 0);
    }

    @Test
    public void multiply() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(10, 10);

        assertTrue(result == 100);
    }

    @Test
    public void divide() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(10, 10);

        assertTrue(result == 1);
    }
}
