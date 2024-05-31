import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        // Introduction: This program is a simple calculator that performs basic arithmetic operations.
        // It allows the user to enter two numbers and choose an operator (+, -, *, /, sq) to perform the calculation.
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Display an introductory message
        System.out.println("Welcome to the Simple Calculator Program!");
        System.out.println("You can perform addition (+), subtraction (-), multiplication (*), division (/), and calculate square root (sq).");

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter an operator
        System.out.print("Enter an operator (+, -, *, /, sq): ");
        String operator = scanner.next();

        // Variable to store the result of the calculation
        double result;

        // Perform the calculation based on the operator
        switch (operator) {
            case "+":
                // Prompt the user to enter the second number
                System.out.print("Enter the second number: ");
                double num2Add = scanner.nextDouble();
                result = num1 + num2Add; // Addition
                break;

            case "-":
                // Prompt the user to enter the second number
                System.out.print("Enter the second number: ");
                double num2Sub = scanner.nextDouble();
                result = num1 - num2Sub; // Subtraction
                break;

            case "*":
                // Prompt the user to enter the second number
                System.out.print("Enter the second number: ");
                double num2Mul = scanner.nextDouble();
                result = num1 * num2Mul; // Multiplication
                break;

            case "/":
                // Prompt the user to enter the second number
                System.out.print("Enter the second number: ");
                double num2Div = scanner.nextDouble();
                // Check for division by zero
                if (num2Div != 0) {
                    result = num1 / num2Div; // Division
                } else {
                    System.out.println("Error! Division by zero.");
                    return; // Exit the program if division by zero occurs
                }
                break;

            case "sq":
                // Calculate the square root
                if (num1 >= 0) {
                    result = Math.sqrt(num1); // Square root
                } else {
                    System.out.println("Error! Cannot calculate the square root of a negative number.");
                    return; // Exit the program if the number is negative
                }
                break;

            default:
                // Handle invalid operator input
                System.out.println("Error! Invalid operator.");
                return; // Exit the program if an invalid operator is entered
        }

        // Display the result of the calculation
        System.out.println("The result is: " + result);
    }
}
