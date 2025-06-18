/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
        ArithmeticBase r= new ArithmeticBase();
        Scanner in= new Scanner(System.in);
        
       System.out.println("Enter first number: ");
        double num1 = in.nextDouble(); 
        System.out.println("Enter second number: ");
        double num2 = in.nextDouble(); 
        
       in.nextLine(); 

        System.out.println("Enter operation (PLUS, MINUS, TIMES, DIVIDE): ");
  

      for (Operation op : Operation.values()) {
            try {
                double result = r.calculate(num1, num2, op);
                System.out.println(num1 + " " + op.toString().toLowerCase() + " " + num2 + " = " + result);
            } catch (IllegalArgumentException e) {
                System.out.println(num1 + " " + op.toString().toLowerCase() + " " + num2 + ": Error - " + e.getMessage());
            }
        }

        in.close();
    
    }
}

