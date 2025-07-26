package Practice.Java.Arrays;

public class binary {

    public static int binarySearch(int arr[],int key){
        int start=0;

        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){ //right
                start=mid+1;  
            }else{
                end=mid-1; //left
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int arr[]={5,9,12,44,55,66,77,88,99,100};
        int key=100;
        int index=binarySearch(arr,key);
        System.out.println("Index: "+index);
    }
}
