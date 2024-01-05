import java.util.Scanner;

public class NumberWordProgram {
  public static void main(String[]args){
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a one-digit number (0-9): ");

    if (scanner.hasNextInt()) {
      int number = scanner.nextInt();

      if (number >=0 && number <=9) {
        String numberInWords = convertToWords(number);

        System.out.println("Number in words: " + numberInWords);
      } else{
        System.out.println("Invalid number! Please enter a one-digit number. ");
      }
    } else {
      System.out.println("Invalid input! Please enter a valid integer. ");
    }

    scanner.close();

  }

  private static String convertToWords(int number) {
    switch (number){
      case 0:
      return "Zero";

      case 1:
      return "One";

      case 2:
      return "Two";

      case 3:
      return "Three";

      case 4:
      return "Four";

      case 5:
      return "Five";

      case 6:
      return "Six";

      case 7:
      return "Seven";

      case 8:
      return "Eight";

      case 9:
      return "Nine";

      default:
      return "Invalid Number!";
    
    }
  }
}