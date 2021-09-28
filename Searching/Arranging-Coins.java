class Solution {
    public int arrangeCoins(int n) {
        double calc = Math.sqrt((2L*n)+(0.25)) - 0.5;
        return (int)calc;
    }
}