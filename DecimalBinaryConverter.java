import java.util.Scanner;

public class DecimalBinaryConverter {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Choose an option:");
      System.out.println("1. Decimal to Binary");
      System.out.println("2. Binary to Decimal");
      System.out.println("3. Exit");

      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Enter a decimal number:");
          double decimalNumber = scanner.nextDouble();
          System.out.println("Binary equivalent: " + decimalToBinary((int) decimalNumber));
          break;

        case 2:
          System.out.println("Enter a binary number:");
          String binaryNumber = scanner.next();
          System.out.println("Decimal equivalent: " + binaryToDecimal(binaryNumber));
          break;
          
        case 3:
          System.out.println("Exiting program. Goodbye!");
          System.exit(0);

        default:
          System.out.println("Invalid choice. Please enter 1, 2, or 3.");
      }
    }
  }

  private static String decimalToBinary(int decimalNumber) {
    return Integer.toBinaryString(decimalNumber);
  }

  private static int binaryToDecimal(String binaryNumber){
    return Integer.parseInt(binaryNumber, 2);
  }
}