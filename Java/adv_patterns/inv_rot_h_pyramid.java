package Practice.Java.adv_patterns;

public class inv_rot_h_pyramid {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){ //spaces (n-i)     
                System.out.print(" ");
    }for(int j=1;j<=i;j++){ //stars (i)
        System.out.print("*");
    }
    System.out.println();
}
    }
}