//https://leetcode.com/problems/contains-duplicate-ii/description/

//Using a HashSet

class Solution {
    //Tc: O(n)  Sc: O(k)
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++)
        {
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
            if(set.size() > k) set.remove(nums[i-k]);
        }
        return false;
    }
}

//TLE Solution
//Tc: O(n^2) Sc: O(1) 
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;

        for(int i = 0; i < n; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if(nums[i] == nums[j] && Math.abs(i-j) <= k) return true;
            }
        }
        return false;
    }
}

