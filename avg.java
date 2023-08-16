//wap a java program to calculate the average values of array elements
import java.util.Scanner;
public class avg {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int sum = 0, avg, n;
    int[] a = new int[5];
    System.out.println("Enter the size of array:");
    n = scan.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.println("Enter the number of array: ");
      a[i] = scan.nextInt();

    }
    for (int i = 0; i < 5; i++) {
      sum = sum + a[i];
    }
    avg = sum / n;
    System.out.println("The Avg of array is: " + avg);
    scan.close();
  }

}
