package com.epam.javatraining.parsercommandline.operation;

import org.junit.Test;
import static org.junit.Assert.*;

public class DivisionTest {

    public DivisionTest() {
    }

    @Test
    public void testPerformOperation() {
        System.out.println("performOperation");
        int leftOperand = 0;
        int rightOperand = 10;
        Division instance = new Division();
        int expResult = 0;
        int result = instance.performOperation(leftOperand, rightOperand);
        assertEquals(expResult, result);
    }

    @Test
    public void testPerformOperationSecond() {
        System.out.println("performOperation");
        int leftOperand = 30;
        int rightOperand = 12;
        Division instance = new Division();
        int expResult = 2;
        int result = instance.performOperation(leftOperand, rightOperand);
        assertEquals(expResult, result);
    }

    @Test
    public void testPerformOperationZero() {
        System.out.println("performOperation");
        int leftOperand = 20;
        int rightOperand = 0;
        Division instance = new Division();
        int expResult = 0;
        try {
            int result = instance.performOperation(leftOperand, rightOperand);
            assertEquals(expResult, result);
        } catch (ArithmeticException ex) {
        }
    }

}
