package pro.sky.homeworkcalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private double num1;
    private double num2;
    private double num3;
    private double num4;
    private CalculatorServiceInterface calculatorServiceInterface;

    @BeforeEach
    public void setUp() {

        num1 = 3;
        num2 = 4;
        num3 = 7;
        num4 = 1;

        calculatorServiceInterface = new CalculatorServiceImpl();
    }

    @Test
    public void plus() {

        double[] expected = {calculatorServiceInterface.plus(num1,num2), calculatorServiceInterface.plus(num3,num4)};
        double[] actual = {num1 + num2, num3 + num4};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void minus() {
        double[] expected = {calculatorServiceInterface.minus(num1,num2), calculatorServiceInterface.minus(num3,num4)};
        double[] actual = {num1 - num2, num3 - num4};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void multiply() {
        double[] expected = {calculatorServiceInterface.multiply(num1,num2), calculatorServiceInterface.multiply(num3,num4)};
        double[] actual = {num1 * num2, num3 * num4};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void divide() {

        double[] expected = {calculatorServiceInterface.divide(num1,num2), calculatorServiceInterface.divide(num3,num4)};
        double[] actual = {num1 / num2, num3 / num4};

        assertArrayEquals(expected, actual);
        assertThrows(IllegalArgumentException.class,null);
    }
}
