package pattern;

import java.util.Scanner;

public class Series_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        for(int i=1; i<=num*2; i++){
            if(i%2!=0){
                System.out.print(i+ " ");
            }
        }
        
        sc.close();
    }

}