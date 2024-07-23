//https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        //Tc: O(n) Sc: O(k)
        HashSet<Integer> seen = new HashSet<>();
        long ans = 0;
        long sum = 0;

        int p1 = 0;
        int p2 = 0;
        int n = nums.length;

        while(p2 < n)
        {
            while(seen.contains(nums[p2]))
            {
                seen.remove(nums[p1]);
                sum -= nums[p1];
                p1++;
            }
            seen.add(nums[p2]);
            sum += nums[p2];
            p2++;

            if(seen.size() == k)
            {
                ans = Math.max(ans, sum);
                sum -= nums[p1];
                seen.remove(nums[p1]);
                p1++;
            }
        }

        return ans;
        
    }
}


