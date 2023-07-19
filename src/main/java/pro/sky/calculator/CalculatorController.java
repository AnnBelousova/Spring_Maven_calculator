package pro.sky.calculator;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping
    public String greeting() {
        return calculatorService.greeting();
    }


    @GetMapping("/plus")
    public Integer plus(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
        try {
            calculatorService.plus(num1, num2);
        } catch (Exception e) {
            System.out.println("Оба парметра обязательны");
        }
        return calculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public Integer minus(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
        try {
            calculatorService.minus(num1, num2);
        } catch (Exception e) {
            System.out.println("Оба парметра обязательны");
        }
        return calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public Integer multiply(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
        try {
            calculatorService.multiply(num1, num2);
        } catch (Exception e) {
            System.out.println("Оба парметра обязательны");
        }
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public Integer divide(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль");
        } else {
            return calculatorService.divide(num1, num2);
        }
    }
}
