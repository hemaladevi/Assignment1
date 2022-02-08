package pattern;

import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int m = num;
        for (int i = num; i >= 1; i--) {
            for (int j = i; j >= 2; j--) {
                System.out.print(" ");
            }
            for (int k = m; k <= num; k++) {
                System.out.print("*");
            }
            for (int l = num - 1; l >= i; l--) {
                System.out.print("*");
            }
            m--;
            System.out.println();
        }
        m = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = m; k <= num-1; k++) {
                System.out.print("*");
            }
            for (int l = num-2; l >= i; l--) {
                System.out.print("*");
            }
            System.out.println();
            m++;
        }
        sc.close();
    }
}
