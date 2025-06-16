package Practice.Java.Patterns;


public class char_pyramid {
    
    public static void main(String[] args) {
        char ch ='A';
        for(int i=1;i<=4;i++){ //1<=4
            for(int j=1;j<=i;j++){ //1<=1
                System.out.print(ch); //A
                ch++; //B
            }
            System.out.println();
        }
       
    }
}
