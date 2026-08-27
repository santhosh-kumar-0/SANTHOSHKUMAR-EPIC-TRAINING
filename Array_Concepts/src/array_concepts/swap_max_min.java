package array_concepts;

import java.util.Scanner;

public class swap_max_min {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n];

        // Input
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        // Find Maximum
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        // Find Minimum
        for(int i = 1; i < n; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}