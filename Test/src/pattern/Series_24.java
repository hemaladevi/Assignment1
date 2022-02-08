package pattern;

import java.util.Scanner;

public class Series_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int start=1,front=1,next;
        System.out.print(start +" "+ front+" ");
        next=start+front;
        for(int i=2; i<num; i++){
            start=next;
            System.out.print(next+ " ");
            next=front+next;
            front=start;
        }
        
        sc.close();
    }

}