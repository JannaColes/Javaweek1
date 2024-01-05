import java.util.Scanner;

public class LargestInteger {

  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter five integers: ");

    int num1 = scanner.nextInt();

    int num2 = scanner.nextInt();

    int num3 = scanner.nextInt();

    int num4 = scanner.nextInt();

    int num5 = scanner.nextInt();

    int largest = findLargest(num1, num2, num3, num4, num5);

    System.out.println("The largest integer is: " + largest);
  }

  private static int findLargest(int a, int b, int c, int d, int e) {
    
    int max = a;
    
    if (b > max){
      max = b;
    }

    if (c > max){
      max = c;
    }

    if (d > max){
      max = d;
    }

    if (e > max){
      max = e;
    }

    return max;

  }
  
}
