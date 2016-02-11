package com.epam.javatraining.parsercommandline;

import com.epam.javatraining.parsercommandline.operation.Operation;
import org.apache.commons.cli.ParseException;

public class ReadingCommandLine {

    public static int getResultOperation(String[] args) throws ParseException {

        ParserCommandLine parser = new ParserCommandLine(args);
        Operation operation = parser.getOperation();
        return operation.performOperation(parser.getLeftOperand(), parser.getRightOperand());        
    }
}
