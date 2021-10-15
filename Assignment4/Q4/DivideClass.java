package Assingment4.Q4;

public class DivideClass {
    public static void divide(int[] arr, int num) {
        try {
            for (int i = 0; i < 15; i++) {
                arr[i] = arr[i] / num;
            }
            System.out.println("Array : ");
            for (int i : arr) {
                System.out.print(i + " ");
            }

        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 6, 12, 18, 24, 30, 36, 42, 48, 54, 60, 66, 72, 78, 84, 90 };
        int arr2[] = { 5, 10, 15, 20, 25 };
        System.out.println("\nArray 1: ");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println("\nArray 2: ");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println("\nDividing correct size array by 3 : ");
        divide(arr1, 3);
        System.out.println("\nDividing wrong size array : ");
        divide(arr2, 5);
        System.out.println("\nDividing correct size array by 0 : ");
        divide(arr1, 0);

    }
}
