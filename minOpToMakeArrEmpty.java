//https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/description/

class Solution {
    //Tc: O(n) Sc: O(n)
    public int minOperations(int[] nums) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int c: map.values())
        {
            if(c ==1) return -1;
        ans += Math.ceil((double) c/3);
        }
        return ans;
    }
}
