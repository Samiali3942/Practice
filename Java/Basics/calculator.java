// calculator using switch case
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        char operator= sc.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println("Sum of two numbers is: "+(a+b));
                break;
            case '-':
                System.out.println("Subtraction of two numbers is: "+(a-b));
                break;
            case '*':
                System.out.println("Multiplication of two numbers is: "+(a*b));
                break;
            case '/':
                System.out.println("Division of two numbers is: "+(a/b));
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        sc.close();
    }
}
