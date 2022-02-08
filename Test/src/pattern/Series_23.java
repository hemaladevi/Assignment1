package pattern;

import java.util.Scanner;

public class Series_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int a = 1, b = 2;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.print(a + " ");
                a = a + 3;
            } else {
                System.out.print(b + " ");
                b = b + 2;
            }
        }

        sc.close();
    }

}
