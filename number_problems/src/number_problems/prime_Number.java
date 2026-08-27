package number_problems;
import java.util.Scanner;

public class prime_Number {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int count = 0;

        if (n <= 1) {
            System.out.println("Not Prime Number");
        } else {

            for (int i = 2; i < n; i++) {

                if (n % i == 0) {
                    count++;
                }

            }

            if (count == 0) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not Prime Number");
            }

        }

    }

}