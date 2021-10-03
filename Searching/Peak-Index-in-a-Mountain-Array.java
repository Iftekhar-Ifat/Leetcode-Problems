class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int high = arr.length-1;
        int low = 0;
        while(low < high){
            int mid = low + (high-low)/2;
            if(arr[mid] > arr[mid+1]){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return high;
    }
}