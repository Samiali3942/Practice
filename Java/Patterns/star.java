package Practice.Java.Patterns;

import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //4
        for(int i=1;i<=n;i++){ //1<=4
            for(int j=1;j<=i;j++){ //1<=1
                System.out.print("*"); //*
            }
            System.out.println(); 
        }
        sc.close();
    }
}
