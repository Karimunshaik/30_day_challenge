//Second Largest

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int largest=arr[arr.length-1];
        int secondLargest=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=largest){
               secondLargest=arr[i];
               break;
            }
        }
        return secondLargest;
        }
       
    }
