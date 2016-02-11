package com.epam.javatraining.parsercommandline;

import com.epam.javatraining.parsercommandline.operation.Addition;
import com.epam.javatraining.parsercommandline.operation.Operation;
import org.apache.commons.cli.ParseException;
import org.junit.Test;
import static org.junit.Assert.*;

public class ParserCommandLineTest {

    public ParserCommandLineTest() {
    }

    @Test
    public void testGetLeftOperand() throws ParseException {
        System.out.println("getLeftOperand");
        String[] args = {"-l", "2", "-r", "10", "-o", "+"};
        ParserCommandLine instance = new ParserCommandLine(args);
        int expResult = 2;
        int result = instance.getLeftOperand();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetRightOperand() throws ParseException {
        System.out.println("getRightOperand");
        String[] args = {"-l", "2", "-r", "10", "-o", "+"};
        ParserCommandLine instance = new ParserCommandLine(args);
        int expResult = 10;
        int result = instance.getRightOperand();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetOperation() throws ParseException {
        System.out.println("getOperation");
        String[] args = {"-l", "2", "-r", "10", "-o", "+"};
        ParserCommandLine instance = new ParserCommandLine(args);
        Operation expResult = new Addition();
        Operation result = instance.getOperation();
        assertEquals(expResult.getClass(), result.getClass());
    }

    @Test
    public void testGetRightOperandNotEnoughArgs() throws ParseException {
        System.out.println("getRightOperand");
        String[] args = {"-l", "2", "-r", "-o", "+"};
        try {
            ParserCommandLine instance = new ParserCommandLine(args);
            int result = instance.getRightOperand();
        } catch (IllegalArgumentException ex) {
        }

    }

}
