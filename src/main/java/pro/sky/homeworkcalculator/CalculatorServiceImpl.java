package pro.sky.homeworkcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorServiceInterface {
    public String hello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public double plus(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public double minus(double num1, double num2) {
        double sum = num1 - num2;
        return sum;
    }

    public double multiply(double num1, double num2) {
        double sum = num1 * num2;
        return sum;
    }

    public double divide(double num1, double num2) {
        double sum = num1 / num2;
        String c = String.valueOf(sum);
        return sum;
    }

}
