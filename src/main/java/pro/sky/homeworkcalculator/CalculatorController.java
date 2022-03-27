package pro.sky.homeworkcalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {
    private CalculatorServiceImpl calculatorService;

    public CalculatorController(CalculatorServiceImpl calculatorService) {
        this.calculatorService = calculatorService;
    }

    @RequestMapping
    public String hello() {
        return calculatorService.hello();
    }

    @RequestMapping("/plus")
    public String plus(@RequestParam double num1,
                      @RequestParam double num2){
        return num1 + "+" + num2 + "=" + calculatorService.plus(num1,num2);

    }

    @RequestMapping(path = "/minus")
    public String minus(@RequestParam double num1,
                       @RequestParam double num2){
        return num1 + "-" + num2 + "=" + calculatorService.minus(num1,num2);
    }

    @RequestMapping(path = "/multiply")
    public String multiply(@RequestParam double num1,
                        @RequestParam double num2){
        return num1 + "*" + num2 + "=" + calculatorService.multiply(num1,num2);
    }

    @RequestMapping(path = "/divide")
    public String divide(@RequestParam double num1,
                        @RequestParam double num2){
        if (num2 == 0) {
            return "Делить на 0 нельзя, измените 2-ой параметр";
        }
        return num1 + "/" + num2 + "=" + calculatorService.divide(num1,num2);
    }

}
