//https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/description/

class Solution {
    public int minOperations(int[] nums) {
         Tc: O(n) Sc: O(n)
         int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int val : map.values()) {
            if (val == 1) {
                return -1; 
            }

            int operations = 0;

            operations += val / 3;
            int remainder = val % 3;

            if (remainder == 1) {
             
                if (val >= 4) {
                    operations += 1; 
                } else {
                    return -1; 
                }
            } else if (remainder == 2) {
                operations += 1; 
            }

            ans += operations;
        }

        return ans;
        
    }
}
