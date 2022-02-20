package pro.sky.homeworkcalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {
    private final CalculatorServiceImpl calculatorService;

    public CalculatorController(CalculatorServiceImpl calculatorService) {
        this.calculatorService = calculatorService;
    }

    @RequestMapping("/calculator")
    public String hello() {
        return hello();
    }

    @RequestMapping("/plus")
    public String plus(@RequestParam(required = true) double num1,
                      @RequestParam(required = true) double num2){
        return num1 + "+" + num2 + "=" + plus(num1,num2);

    }

    @RequestMapping(path = "/minus")
    public String minus(@RequestParam(required = true) double num1,
                       @RequestParam(required = true) double num2){
        return num1 + "-" + num2 + "=" + minus(num1,num2);
    }

    @RequestMapping(path = "/multiply")
    public String multiply(@RequestParam(required = true) double num1,
                        @RequestParam(required = true) double num2){
        return num1 + "*" + num2 + "=" + multiply(num1,num2);
    }

    @RequestMapping(path = "/divide")
    public String divide(@RequestParam(required = true) double num1,
                        @RequestParam(required = true) double num2){
        if (num2 == 0) {
            return "Делить на 0 нельзя, измените 2-ой параметр";
        }
        return num1 + "/" + num2 + "=" + divide(num1,num2);
    }

}
