package ru.calcmax.calculator1;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements ru.calcmax.calculator1.CalcService {
    public String hello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public String plus(int num1, int num2) {
        int sum = num1 + num2;
        return Integer.toString(sum);
    }

    public String minus(int num1, int num2) {
        int difference = num1 - num2;
        return Integer.toString(difference);
    }

    public String multiply(int num1, int num2) {
        int multiplication = num1 * num2;
        return Integer.toString(multiplication);
    }

    public String divide(int num1, int num2) {
        int division = 0;
        Integer.toString(division);
        try {
            division = num1 / num2;
        } catch (Exception e) {
            return "Нельзя делить на ноль";
        }

        return String.valueOf(division);
    }
}
