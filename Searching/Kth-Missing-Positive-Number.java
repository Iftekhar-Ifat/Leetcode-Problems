class Solution {
    public int findKthPositive(int[] arr, int k) {
        int temp = k;

        int ind = 0;

        for(int i=0; i<arr.length; i++){
            if(temp > ((arr[i]-ind)-1)){
                temp -= (arr[i]-ind)-1;
                ind = arr[i];
            }else{
                return ind+(temp);
            }
        }
        return arr[arr.length-1]+temp;
    }
}