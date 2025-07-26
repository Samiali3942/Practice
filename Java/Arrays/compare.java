package Practice.Java.Arrays;


public class compare {

    public static int highest(int arr1[]){
        int highest=Integer.MIN_VALUE;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>highest){
                highest=arr1[i];
            }
        }
        return highest;
    }

    public static int lowest(int arr1[]){
        int lowest=Integer.MAX_VALUE;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]<lowest){
                lowest=arr1[i];
            }
        }
        return lowest;
    }
    public static void main(String[] args) {

        int arr1[]={1,5,7,2,3,17,66,44,33,22,11,88,99,100};

        int highest=highest(arr1);
        int lowest=lowest(arr1);

        System.out.println("Highest: "+highest);
        System.out.println("Lowest: "+lowest);      


    }
}
