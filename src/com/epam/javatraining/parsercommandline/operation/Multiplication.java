package com.epam.javatraining.parsercommandline.operation;

public class Multiplication implements Operation {

    public Multiplication() {
    }

    @Override
    public int performOperation(int leftOperand, int rightOperand) {
        return leftOperand * rightOperand;
    }
    
}
