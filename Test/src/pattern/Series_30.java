package pattern;

import java.util.Scanner;

public class Series_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int a=1,b=3;
        for(int i=1; i<=num; i++){
            System.out.print(a+" ");
            a=a+b;
            b=b+2;
        }
        
        sc.close();
    }

}

