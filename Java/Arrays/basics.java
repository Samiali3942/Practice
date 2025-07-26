package Practice.Java.Arrays;

public class basics {

    public static void update(int marks[], int nonchangeable){
        nonchangeable=10;
        for (int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={97,98,99}; //non primitive data types are passed by reference
        int nonchangeable=5; //primitive data types are passed by value
        update(marks,nonchangeable);
        System.out.println(nonchangeable);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        
}
}