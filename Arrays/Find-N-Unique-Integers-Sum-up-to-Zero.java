class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        if(n%2==0){
            int num = 1;
            for(int i=0; i< (n/2); i++){
                ans[i] = num;
                ans[i+(n/2)] = -num;
                num++;
            }
        }else{
            ans[0] = 0;
            n--;
            int num = 1;
            for(int i=0; i< (n/2); i++){
                ans[i] = num;
                ans[i+(n/2)] = -num;
                num++;
            }
        }
        return ans;
    }
}