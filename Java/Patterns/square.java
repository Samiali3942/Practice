package Practice.Java.Patterns;
import java.util.Scanner;



public class square {
    public static void main(String[] args) {
     
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){   // rows and outer loop
            for(int j=1;j<=n;j++){  // columns and inner loop
                System.out.print("*");  // print the star
            }
            System.out.println();  // print the new line
        }
        sc.close();
}

}

// 4

/*
 * * * *
 * * * *
 * * * *
 * * * *
 */
