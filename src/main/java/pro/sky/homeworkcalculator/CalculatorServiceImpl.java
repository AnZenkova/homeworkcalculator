package pro.sky.homeworkcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorServiceInterface {
    public static String hello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public static String plus(String num1, String num2) {
        double a = Integer.parseInt(num1);
        double b = Integer.parseInt(num2);
        double sum = a + b;
        String c = String.valueOf(sum);
        return num1 + "+" + num2 + "=" + c;
    }

    static String minus(String num1, String num2) {
        double a = Integer.parseInt(num1);
        double b = Integer.parseInt(num2);
        double sum = a - b;
        String c = String.valueOf(sum);
        return num1 + "-" + num2 + "=" + c;
    }

    static String multiply(String num1, String num2) {
        double a = Integer.parseInt(num1);
        double b = Integer.parseInt(num2);
        double sum = a * b;
        String c = String.valueOf(sum);
        return num1 + "*" + num2 + "=" + c;
    }

    static String divide(String num1, String num2) {
        double a = Integer.parseInt(num1);
        double b = Integer.parseInt(num2);
        if (b == 0) {
            return "Делить на 0 нельзя, измените 2-ой параметр";
        }
        double sum = a / b;
        String c = String.valueOf(sum);
        return num1 + "/" + num2 + "=" + c;
    }

}
