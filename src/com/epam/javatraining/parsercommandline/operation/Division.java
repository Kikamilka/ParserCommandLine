package com.epam.javatraining.parsercommandline.operation;

public class Division implements Operation {

    public Division() {
    }

    @Override
    public int performOperation(int leftOperand, int rightOperand) {
        return leftOperand / rightOperand;
    }
    
}
