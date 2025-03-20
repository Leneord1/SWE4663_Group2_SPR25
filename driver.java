import java.lang.Math;
import java.util.Scanner;
import java.io.*;
import java.awt.GraphicsEnvironment;
import java.net.URISyntaxException;

public class driver {
    
    public static void main(String[] args){
        //All the variables that will be used
        Scanner userInput = new Scanner(System.in);
        double num1;
        double num2;
        int operator;
        boolean loop = true;
        Calculator calculator = new Calculator();
        quadFormula qFormula = new quadFormula();

        do {
            //First loop
            System.out.print("""
                    What operation would you like to do?
                    1. +
                    2. -
                    3. *
                    4. /
                    5. ^
                    9. Quit
                    \s""");
            operator = userInput.nextInt();

            switch (operator) {
                case 1: //does addition
                    System.out.println("What is your first number? ");
                    num1 = userInput.nextDouble();

                    System.out.println("What is your second number? ");
                    num2 = userInput.nextDouble();

                    System.out.println(calculator.addition(num1, num2));
                    break;

                case 2: //does subtraction
                    System.out.println("What is your first number? ");
                    num1 = userInput.nextDouble();

                    System.out.println("What is your second number? ");
                    num2 = userInput.nextDouble();

                    System.out.println(calculator.subtraction(num1, num2));
                    break;

                case 3:  //does multiplicaiton
                    System.out.println("What is your first number? ");
                    num1 = userInput.nextDouble();

                    System.out.println("What is your second number? ");
                    num2 = userInput.nextDouble();

                    System.out.println(calculator.multiplication(num1, num2));
                    break;

                case 4:  //does division
                    System.out.println("What is your first number? ");
                    num1 = userInput.nextDouble();

                    System.out.println("What is your second number? ");
                    num2 = userInput.nextDouble();

                    System.out.println(calculator.division(num1, num2));
                    break;

                case 5:  //does exponents
                    System.out.println("What is your first number? ");
                    num1 = userInput.nextDouble();

                    System.out.println("What is your second number? ");
                    num2 = userInput.nextDouble();

                    System.out.println(calculator.exponent(num1, num2));
                    break;
                case 6:  //does modulo computations
                    System.out.println("What is your first number? ");
                    num1 = userInput.nextDouble();

                    System.out.println("What is your second number? ");
                    num2 = userInput.nextDouble();

                    System.out.println(calculator.modulo(num1, num2));
                    break;

                case 9:  //breaks the loop
                    loop = false;
                    break;

            }
        }
        while(loop);  
        }
    }
