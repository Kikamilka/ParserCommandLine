package com.epam.javatraining.parsercommandline.operation;

public class Addition implements Operation {

    public Addition() {
    }

    @Override
    public int performOperation(int leftOperand, int rightOperand) {
        return leftOperand + rightOperand;
    }
    
}
