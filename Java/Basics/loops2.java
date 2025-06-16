// find the factorial of a number
import java.util.Scanner;
public class loops2 {
    public static void main(String[] args) {
    /*  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        sc.close();
    */

    Scanner scanner = new Scanner(System.in); //5
    int num = scanner.nextInt(); //5
    int factorial = 1; //1
    do {
        factorial *= num; //1*5=5
        num--; //4
    } while (num > 0); //4>0

    System.out.println(factorial); //120
    scanner.close();
    }
}

// 5! = 5 * 4 * 3 * 2 * 1 = 120