package com.epam.javatraining.parsercommandline.operation;

import org.junit.Test;
import static org.junit.Assert.*;

public class AdditionTest {
    
    public AdditionTest() {
    }

    @Test
    public void testPerformOperation() {
        System.out.println("performOperation");
        int leftOperand = 10;
        int rightOperand = 0;
        Addition instance = new Addition();
        int expResult = 10;
        int result = instance.performOperation(leftOperand, rightOperand);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPerformOperationNegative() {
        System.out.println("performOperation");
        int leftOperand = -10;
        int rightOperand = -10;
        Addition instance = new Addition();
        int expResult = -20;
        int result = instance.performOperation(leftOperand, rightOperand);
        assertEquals(expResult, result);
    }
    
}
