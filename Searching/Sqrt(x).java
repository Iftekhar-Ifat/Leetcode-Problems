class Solution {
    public int mySqrt(int x) {

        if(x<2){
            return x;
        }

        long high = (long)x/2;
        long low = 0;
        while(low <= high){
            long mid = low + (high-low)/2;
            if(mid*mid == x){
                return (int) mid;
            }else if(mid*mid < x){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return (int) low-1;

    }
}