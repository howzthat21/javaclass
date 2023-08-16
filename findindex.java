import java.util.Scanner;

public class findindex {
    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if the element is found
            }
        }
        return -1; // Return -1 if the element is not found in the array
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

        System.out.print("Enter the target element you want to find: ");
        int targetElement = scanner.nextInt();

        scanner.close();

        int index = findIndex(myArray, targetElement);

        if (index != -1) {
            System.out.println("Element " + targetElement + " found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
