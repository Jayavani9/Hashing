525. Contiguous Array

  
Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.

Example 1:

Input: nums = [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
Example 2:

Input: nums = [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.


//Bruteforce approach (TLE solution)
//Tc: O(n^2) and Sc: O(1)
  class Solution {
    public int findMaxLength(int[] nums) {
        int maxim = 0;
        for(int i = 0 ; i < nums.length; i++){
            int zeros = 0;
            int ones = 0;
            for(int j = i ; j < nums.length; j++)
            {
                if(nums[j] == 0) zeros += 1;
                else ones += 1;
                if(zeros == ones)
                {
                    maxim = Math.max(maxim, j-i+1);
                }   
            }
        }
        return maxim;
    }
}


