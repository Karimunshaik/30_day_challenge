//Rotate Array
class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
      // Normalize d to handle cases where d is greater than array length
        d=d%arr.length;
        int n=arr.length;
      // Step 1: Reverse the first part (0 to d-1)
        reverse(arr,0,d-1);
      
      // Step 2: Reverse the second part (d to n-1)
        reverse(arr,d,n-1);
      
      // Step 3: Reverse the entire array (0 to n-1)
        reverse(arr,0,n-1);
        
    }
  // Helper function to reverse the array between indices left and right
    static void reverse(int[] arr,int left, int right){
        while(left<right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
        }
    }
}
