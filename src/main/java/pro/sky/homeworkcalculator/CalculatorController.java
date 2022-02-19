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
        return CalculatorServiceImpl.hello();
    }

    @RequestMapping("/plus")
    public String plus(@RequestParam(required = true) String num1,
                      @RequestParam(required = true) String num2){
        return CalculatorServiceImpl.plus(num1,num2);

    }

    @RequestMapping(path = "/minus")
    public String minus(@RequestParam(required = true) String num1,
                       @RequestParam(required = true) String num2){
        return CalculatorServiceImpl.minus(num1,num2);
    }

    @RequestMapping(path = "/divide")
    public String divide(@RequestParam(required = true) String num1,
                        @RequestParam(required = true) String num2){
        return CalculatorServiceImpl.divide(num1,num2);
    }

}
