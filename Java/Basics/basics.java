
import java.util.*;
public class basics {
    public static void main(String[] args) {
        
        // 1  Average of 3 numbers

        Scanner sc= new Scanner(System.in);
        /*int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int avg=((a+b+c)/3);

        System.out.println(avg);*/

        // 2 area of a square
         
       /*  int side=sc.nextInt();
        int area=side*side;
        System.out.println(area);*/

        // 3 float cost of the items
        System.out.println("Enter the price of the pencil");
        float pencil=sc.nextFloat();
        System.out.println("Enter the price of the pen");
        float pen=sc.nextFloat();
        System.out.println("Enter the price of the eraser");
        float eraser=sc.nextFloat();

        float total=(pencil+pen+eraser);
        System.out.println("The total price of the items is "+total);
         
        float gst=total +(0.18f*total);
        System.out.println("The gst of this is "+gst); 
        sc.close();
    }
}
