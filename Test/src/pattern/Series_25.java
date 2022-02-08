package pattern;

import java.util.Scanner;

public class Series_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int a = 2, b = 3;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.print(a + " ");
                a = a * 2;
            } else {
                System.out.print(b + " ");
                b = b * 3;
            }
        }

        sc.close();
    }

}