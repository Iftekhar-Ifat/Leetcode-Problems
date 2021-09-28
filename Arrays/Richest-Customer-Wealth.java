class Solution {
    public int maximumWealth(int[][] accounts) {
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<accounts.length; i++){
            int temp = 0;
            for(int j=0; j<accounts[i].length; j++){
                temp += accounts[i][j];
            }
            mx = Math.max(mx, temp);
        }
        return mx;
    }
}