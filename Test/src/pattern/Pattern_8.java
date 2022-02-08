package pattern;

import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; i % 2 != 0 && j <= num; j++) {
                System.out.print(i);
                int h = i;
                if (j == num) {
                    System.out.print(++h);
                }
            }

            for (int k = 1; i % 2 == 0 && k <= num; k++) {
                int h = i;
                if (k == 1) {
                    System.out.print(++h);
                }
                System.out.print(i);
            }

            System.out.println();
        }

        sc.close();
    }
}
