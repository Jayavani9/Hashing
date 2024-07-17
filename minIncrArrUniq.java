//https://leetcode.com/problems/minimum-increment-to-make-array-unique/

//Bruteforce (TLE Solution)
class Solution {
    //Tc: O(n^2) Sc: O(n) 
    public int minIncrementForUnique(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int ans = 0;

        for(int n:nums)
        {
            while(set.contains(n))
            {
                ans++;
                n++;
            }
            set.add(n);
        }
        return ans;
    }
}

//Solution using sorting 

class Solution {
    public int minIncrementForUnique(int[] nums) {
        //Tc: O(nlogn) Sc: O(1)
        Arrays.sort(nums);
        int ans = 0;

        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] <= nums[i-1])
            {
                ans += (nums[i-1] -nums[i]+1);
                nums[i] = nums[i-1]+1;
            }
        }

        return ans;
    }
}
