package Assingment4.Q4;

public class SortClass {
    public static void sort(int[] arr) {
        try {
            for (int i = 0; i < 10; i++) {
                for (int j = i + 1; j < 10; j++) {
                    if (arr[j] < arr[i]) {
                        int x = arr[i];
                        arr[i] = arr[j];
                        arr[j] = x;
                    }
                }
            }
            System.out.println("Array after sorting : ");
            for (int i : arr) {
                System.out.print(i + " ");
            }
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }

    }

    public static void main(String[] args) {
        // array length 10
        int arr1[] = { 32, 12, 4, 90, 45, 10, 22, 78, 5, 1 };
        int arr2[] = { 23, 43, 1, 20 };
        System.out.println("\nArray 1 before sorting : ");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println("\nArray 2 before sorting : ");
        for (int i : arr2) {
            System.out.print(i + " ");
        }

        System.out.println("\nSorting correct size array : ");
        sort(arr1);

        System.out.println("\nSorting incorrect size array : ");
        sort(arr2);

    }
}
