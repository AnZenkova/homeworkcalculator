package pro.sky.homeworkcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl {

    public static String hello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }
    public static String sum(String num1, String num2){
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        int sum = a + b;
        String c = String.valueOf(sum);
        return c;
    }
}
