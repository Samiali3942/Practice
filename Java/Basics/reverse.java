public class reverse {
    public static void main(String[] args) {

     int n=10899; //10899
     while(n>0){       //10899>0
        int lastdigit=n%10;    //10899%10=9
        System.out.print(lastdigit);    //9
        n=n/10;         //10899/10=1089
     }
     System.out.println();   //1089>0
}
}