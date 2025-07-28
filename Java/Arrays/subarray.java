package Practice.Java.Arrays;

public class subarray {

    public static void printSubarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){ // j=i because we want to print the subarray from i to j
                for(int k=i;k<=j;k++){ // k=i because we want to print the subarray from i to j
                    System.out.print(arr[k]+" "); // print the subarray from i to j
                }
                System.out.println();
            }
            System.out.println();
        }
    }   
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printSubarray(arr);
    }
}
