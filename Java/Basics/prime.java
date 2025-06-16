//prime number

import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //7
        boolean isprime=true; //true
        for(int i=2;i<=n-1;i++){ //2<=7-1=6
            if(n%i==0){ //7%2==0
                isprime=false; //false
            }
        }
        if(isprime==true){ //true
            System.out.println("n is prime"); //n is prime
        }else{
            System.out.println("n is not prime"); //n is not prime
        }
        sc.close();
}
}