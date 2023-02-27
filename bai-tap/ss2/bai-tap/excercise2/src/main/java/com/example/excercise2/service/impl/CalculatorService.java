package com.example.excercise2.service.impl;

import com.example.excercise2.service.ICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService{

    @Override
    public double calculator(double firstOperand, double secondOperand, String operator) {
        switch (operator){
            case "Addition(+)":
                return firstOperand + secondOperand;
            case "Subtraction(-)":
                return firstOperand - secondOperand;
            case "Multiplication(*)":
                return firstOperand * secondOperand;
            case "Division(/)":
                return firstOperand / secondOperand;
        }
        return 0;
    }
}
