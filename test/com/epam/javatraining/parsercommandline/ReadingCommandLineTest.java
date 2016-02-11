package com.epam.javatraining.parsercommandline;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReadingCommandLineTest {

    public ReadingCommandLineTest() {
    }

    @Test
    public void testGetResultOperation() throws Exception {
        String[] args = {"-l", "2", "-r", "10", "-o", "+"};
        int result = ReadingCommandLine.getResultOperation(args);
        assertEquals(12, result);
    }

    @Test
    public void testGetResultOperationExseption() throws Exception {
        String[] args = {"-l", "2", "-r", "10", "-o", "="};
        try {
            int result = ReadingCommandLine.getResultOperation(args);
        } catch (IllegalArgumentException ex) {
        }
    }
    
    @Test
    public void testGetResultOperationExseptionSizeArguments() throws Exception {
        String[] args = {"-l", "2", "-r", "10"};
        try {
            int result = ReadingCommandLine.getResultOperation(args);
        } catch (IllegalArgumentException ex) {
        }
    }

}
