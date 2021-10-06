class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> st = new HashSet<>();
        HashSet<Integer> st2 = new HashSet<>();

        for(int i=0; i<nums1.length; i++){
            st.add(nums1[i]);
        }

        for(int i=0; i<nums2.length; i++){
            if(st.contains(nums2[i])){
                st2.add(nums2[i]);
            }
        }

        int i = 0;
        int[] ans = new int[st2.size()];
        for(int num : st2){
            ans[i] = num;
            i++;
        }
        return ans;
    }
}