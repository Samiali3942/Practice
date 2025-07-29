package Practice.Java.Arrays;

public class MaxSubArrayB {

    public static void maxSubArray(int arr[]){
        // Initialize variables to store the current subarray sum and the maximum sum found so far
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;   
        // Outer loop: choose the starting index of the subarray
        for(int i=0;i<arr.length;i++){
            // Middle loop: choose the ending index of the subarray
            for(int j=i;j<arr.length;j++){ 
                currSum = 0; // Reset current sum for each new subarray
                // Inner loop: calculate the sum of the subarray from i to j
                for(int k=i;k<=j;k++){ 
                    currSum+=arr[k];
                }
                // Update maxSum if the current subarray sum is greater
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        } 
        // Print the maximum subarray sum
        System.out.println(maxSum);
    }   
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        maxSubArray(arr);
    }
}
