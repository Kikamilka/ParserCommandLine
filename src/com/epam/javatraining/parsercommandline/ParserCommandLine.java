package com.epam.javatraining.parsercommandline;

import com.epam.javatraining.parsercommandline.operation.Multiplication;
import com.epam.javatraining.parsercommandline.operation.Operation;
import com.epam.javatraining.parsercommandline.operation.Subtraction;
import com.epam.javatraining.parsercommandline.operation.Division;
import com.epam.javatraining.parsercommandline.operation.Addition;
import org.apache.commons.cli.*;

public class ParserCommandLine {
    private int leftOperand;
    private int rightOperand;
    private Operation operation;

    public ParserCommandLine(String[] args) throws ParseException{
        
        if (args == null || args.length != 6) {
            throw new IllegalArgumentException("Wrong size command line");
        }

        Options options = new Options();
        options.addOption("l", true, "Left operand");
        options.addOption("r", true, "Right operand");
        options.addOption("o", true, "Operation");

        CommandLineParser parser = new PosixParser();
        CommandLine commandLine = parser.parse(options, args);


        leftOperand = Integer.parseInt(commandLine.getOptionValue("l"));
        rightOperand = Integer.parseInt(commandLine.getOptionValue("r"));
        String s = commandLine.getOptionValue("o");
        switch (s) {
            case "+":
                operation = new Addition();
                break;
            case "-":
                operation = new Subtraction();
                break;
            case "*":
                operation = new Multiplication();
                break;
            case "/":
                operation = new Division();
                break;
            default:
                throw new IllegalArgumentException("Wrong operation");
        }
    }

    public int getLeftOperand() {
        return leftOperand;
    }

    public int getRightOperand() {
        return rightOperand;
    }

    public Operation getOperation() {
        return operation;
    }
}