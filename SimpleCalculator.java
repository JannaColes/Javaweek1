import java.util.Scanner;

public class SimpleCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first operand: ");
    double operand1 = scanner.nextDouble();

    System.out.print("Enter the second operand: ");
    double operand2 = scanner.nextDouble();

    System.out.print("Enter the operator (+, -, *, /): ");
    char operator = scanner.next().charAt(0);

    double result = 0.0;

    switch (operator){
      case '+':
      result = operand1 + operand2;
      break;

      case '-':
      result = operand1 - operand2;
      break;

      case '*':
      result = operand1 * operand2;
      break;

      case '/':
      if (operand2 != 0){
        result = operand1 / operand2;
      } else {
        System.out.println("Error: Division by zero is not allowed. ");
        System.exit(0);
      }
      break;
      
      default:
      System.out.println("Error: Invalid operator entered. ");
      System.exit(0);
    }

    System.out.println("Result: " + result);

    scanner.close();
  }

  }
  

