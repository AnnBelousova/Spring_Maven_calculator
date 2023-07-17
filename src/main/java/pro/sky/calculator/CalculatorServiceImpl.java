package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public Integer plus(Integer num1, Integer num2) throws NullPointerException {
        if (num1 == 0 || num2 == 0) {
            throw new NullPointerException("Аргумент не может быть ноль");
        } else {
            return num1 + num2;
        }
    }

    @Override
    public int minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public int divide(Integer num1, Integer num2) {
        return num1 / num2;
    }
}
