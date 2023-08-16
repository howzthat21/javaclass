import java.util.Scanner;

public class arraymax {
    public static int findMaxValue(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null.");
        }

        int maxValue = arr[0]; // Assume the first element as the maximum

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i]; // Update the maxValue if a greater value is found
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] myArray = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt();
        }

        scanner.close();

        int max = findMaxValue(myArray);
        System.out.println("The maximum value in the array is: " + max);
    }
}
