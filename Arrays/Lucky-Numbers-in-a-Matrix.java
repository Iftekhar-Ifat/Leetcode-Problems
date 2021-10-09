class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        for(int i=0; i< matrix.length; i++){
            int k = 0;

            int small = Integer.MAX_VALUE;
            for(int j=0; j< matrix[0].length; j++){
                if(small > matrix[i][j]){
                    small = matrix[i][j];
                    k = j;
                }
            }

            int big = Integer.MIN_VALUE;

            for(int j=0; j< matrix.length; j++){
                big = Math.max(matrix[j][k], big);
            }

            if(big == small){
                ans.add(big);
            }
        }
        return ans;
    }
}