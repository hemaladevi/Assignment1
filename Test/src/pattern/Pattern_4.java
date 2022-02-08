package pattern;

import java.util.Scanner;

public class Pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int m = num;
        for (int i = num; i >= 1; i--) {
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = m; k <= num; k++) {
                System.out.print("*");
            }
            System.out.println();
            m--;
        }

        sc.close();
    }
}
