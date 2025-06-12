// find the factorial of a number
import java.util.Scanner;
public class loops2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        sc.close();
    }
}

// 5! = 5 * 4 * 3 * 2 * 1 = 120