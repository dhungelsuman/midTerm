/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * 
 */

enum Operation {
    PLUS,
    MINUS,
    TIMES,
    DIVIDE
}

public class ArithmeticBase 
{
 public double x,y;
     double calculate(double x, double y, Operation operation)
    {
        switch (operation)
        {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                if (y == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero.");
                }
                return x / y;
            default:
                throw new AssertionError("Unknown operation: " + operation);
        }
    }
   
}
