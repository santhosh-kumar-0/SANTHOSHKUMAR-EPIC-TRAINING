package String;

import java.util.Scanner;

public class duplicate {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        int[] count = new int[26];
        int val = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                val = str.charAt(i) - 'a';
            } 
            else {
                val = str.charAt(i) - 'A';
            }

            count[val]++;
        }

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {

                val = str.charAt(i) - 'A';

                if (count[val] > 1) {
                    System.out.println(str.charAt(i));
                    count[val] = 0;
                }

            } 
            else {

                val = str.charAt(i) - 'a';

                if (count[val] > 1) {
                    System.out.println(str.charAt(i));
                    count[val] = 0;
                }
            }
        }
    }
}