package Practice.Java.Arrays;

public class linear {

    public static int linearSearch(int arr[],int key){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16,18,20};

        int key=11;

        int index= linearSearch(arr,key);
        if(index==-1){
            System.out.println("Not found");
        }else{
            System.out.println("Found at index: "+index);
        }
    }
}
