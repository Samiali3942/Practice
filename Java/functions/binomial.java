package Practice.Java.functions;

import java.util.Scanner;

public class binomial {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of r: ");
        int r = sc.nextInt();
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nmrfact = factorial(n - r);
        int bincoeff = nfact / (rfact * nmrfact);
        System.out.println("The binomial coefficient is: " + bincoeff);
        sc.close();
    }
}
