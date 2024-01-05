import java.util.Scanner;

public class FrequencyCounter {
  public static void main(String[] args) {
    int[] numbers = new int[100];

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter 100 integers (from 0 to 9): ");

    for (int i = 0; i < 100; i++) {
      while (true) {
        System.out.print("Enter intger #" + (i + 1)+ ":");
        int num = scanner.nextInt();
        if (num >= 0 && num <= 9) {
          numbers[i] = num;
          break;
        } else {
          System.out.println("Invalid input. Please enter a number between 0 and 9.");
        }
      }
    }
    System.out.println("\nNumber \tFrequency");
    for (int i = 0; i < 10; i++){
      int frequency = calculateFrequency(numbers, i);
      System.out.println(i + "\t" + frequency + "times");
    }

    scanner.close();
  }

  private static int calculateFrequency(int[] array, int number){
    int frequency = 0;
    for(int i = 0; i < array.length; i++) {
      if (array[i] == number) {
        frequency++;
      }
    }
    return frequency;
    
  }
  
}
