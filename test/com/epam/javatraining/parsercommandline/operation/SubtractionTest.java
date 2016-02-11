package com.epam.javatraining.parsercommandline.operation;

import org.junit.Test;
import static org.junit.Assert.*;

public class SubtractionTest {
    
    public SubtractionTest() {
    }

    @Test
    public void testPerformOperation() {
        System.out.println("performOperation");
        int leftOperand = 0;
        int rightOperand = 10;
        Subtraction instance = new Subtraction();
        int expResult = -10;
        int result = instance.performOperation(leftOperand, rightOperand);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPerformOperationSecond() {
        System.out.println("performOperation");
        int leftOperand = 100;
        int rightOperand = -100;
        Subtraction instance = new Subtraction();
        int expResult = 200;
        int result = instance.performOperation(leftOperand, rightOperand);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPerformOperationElse() {
        System.out.println("performOperation");
        int leftOperand = -6;
        int rightOperand = -10;
        Subtraction instance = new Subtraction();
        int expResult = 4;
        int result = instance.performOperation(leftOperand, rightOperand);
        assertEquals(expResult, result);
    }
    
}
