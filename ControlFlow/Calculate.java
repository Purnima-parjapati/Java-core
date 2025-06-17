package ControlFlow;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response; // Declare response variable

        do {
            // Input numbers
            System.out.println("Enter the first number:");
            double num1 = sc.nextDouble();

            System.out.println("Enter the second number:");
            double num2 = sc.nextDouble();

            // Input operator
            System.out.println("Choose an operator (+, -, *, /):");
            char operator = sc.next().charAt(0);

            // Perform operation using switch-case
            switch (operator) {
                case '+':
                    System.out.println("Result = " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Result = " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result = " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println("Result = " + (num1 / num2));
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid operator.");
            }

            // Ask user if they want to continue
            System.out.println("Do you want to perform another operation? (y/n):");
            response = sc.next(); // Now response is declared and used properly

        } while (response.equalsIgnoreCase("y")); // handles 'y' or 'Y'

        System.out.println("Thank you for using the calculator!");
        sc.close();
    }
}


