package pro.sky.homeworkcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorServiceImpl calculatorService;

    public CalculatorController(CalculatorServiceImpl calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String hello() {
        return CalculatorServiceImpl.hello();
    }

    @GetMapping(path = "/calculator/plus")
    public String sum(@RequestParam(required = true) String num1,
                      @RequestParam(required = true) String num2){
        return CalculatorServiceImpl.sum(num1,num2);
    }

}
