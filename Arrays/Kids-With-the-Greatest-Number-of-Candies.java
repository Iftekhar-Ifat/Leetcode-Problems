class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {


        ArrayList<Boolean> bool = new ArrayList<>();
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<candies.length; i++){
            mx = Math.max(mx, candies[i]);
        }
        for(int i=0; i<candies.length; i++){
            int chk = candies[i] + extraCandies;
            if(chk >= mx){
                bool.add(true);
            }else{
                bool.add(false);
            }
        }
        return bool;
    }
}