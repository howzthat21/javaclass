import java.util.Scanner;

public class eg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = calculateSum(arr);
        System.out.println("The sum of the elements in the array is: " + sum);

        scanner.close();
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum;
    }
}
