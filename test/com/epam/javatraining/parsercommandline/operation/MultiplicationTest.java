package com.epam.javatraining.parsercommandline.operation;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplicationTest {
    
    public MultiplicationTest() {
    }

    @Test
    public void testPerformOperation() {
        System.out.println("performOperation");
        int leftOperand = 10;
        int rightOperand = 0;
        Multiplication instance = new Multiplication();
        int expResult = 0;
        int result = instance.performOperation(leftOperand, rightOperand);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPerformOperationSecond() {
        System.out.println("performOperation");
        int leftOperand = 10;
        int rightOperand = -20;
        Multiplication instance = new Multiplication();
        int expResult = -200;
        int result = instance.performOperation(leftOperand, rightOperand);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPerformOperationNegativeOperands() {
        System.out.println("performOperation");
        int leftOperand = -3;
        int rightOperand = -2;
        Multiplication instance = new Multiplication();
        int expResult = 6;
        int result = instance.performOperation(leftOperand, rightOperand);
        assertEquals(expResult, result);
    }
    
}
