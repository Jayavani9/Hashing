217. Contains Duplicate
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

//Using a HashSet
  //TC: O(n) Sc: O(n)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0 ; i < nums.length; i++){
            if(set.contains(nums[i])) 
            {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}


/* Sorting Tc: O(nlogn)
 Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++)
        {
            if(nums[i] == nums[i+1]) return true;
        }
       
        return false;
        */

/* Linear Search Tc: O(n^2)
 for(int i = 0 ; i < nums.length-1; i++)
        {
            for(int j = i+1 ; j < nums.length;j++)
            {
                if(nums[i] == nums[j])
                {
                    return true;
                }

            }
        }
        return false;
*/
