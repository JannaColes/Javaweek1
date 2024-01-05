import java.util.Scanner;

public class TestAverage {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int sum  = 0;

    int count = 0;
     
    int number;

    System.out.println("Enter numbers (enter -999 to stop): ");

    while ((number = scanner.nextInt()) != -999) {
      sum += number;
      count++;
    }

    if (count > 0) {
      double average = (double) sum / count;

      System.out.println("Sum: " + sum);
      System.out.println("Average: " + average);
    } else {
      System.out.println("No numbers entered. ");
    }

    scanner.close();
  }
  
}
