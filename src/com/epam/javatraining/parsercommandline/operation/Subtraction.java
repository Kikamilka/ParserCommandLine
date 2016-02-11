package com.epam.javatraining.parsercommandline.operation;

public class Subtraction implements Operation {

    public Subtraction() {
    }

    @Override
    public int performOperation(int leftOperand, int rightOperand) {
        return leftOperand - rightOperand;
    }
    
}
