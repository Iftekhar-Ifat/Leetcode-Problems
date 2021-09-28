class Solution {
    public boolean isPerfectSquare(int num) {

        long low = 1;
        long high = (num/2)+1;

        while(low <= high){
            long mid = low+(high-low)/2;
            if(mid*mid == num){
                return true;
            }else if(mid*mid < num){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }
}
