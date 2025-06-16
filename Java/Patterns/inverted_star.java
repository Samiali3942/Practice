package Practice.Java.Patterns;

import java.util.Scanner;

public class inverted_star {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){ //1<=4
            for(int j=1;j<=n-i+1;j++){ //1<=4-1+1=4
                System.out.print("*"); //*
            }
            System.out.println(); 
        }
        sc.close();
    }
}
