//Using a single HashMap
//Time complexity : O(n) ; Space complexity : O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++)
        {
            int diff = target - nums[i];
            if(map.containsKey(diff))
            {
                return new int[]{i, map.get(diff)};
            }
                map.put(nums[i], i);
        }
        
        return null;
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer > hmap = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++)
        {
            if(hmap.containsKey(target - nums[i]))
            {
                return new int[]{hmap.get(target - nums[i]),i};
            }
            hmap.put(nums[i],i);
        }

       

        return null;
    }
}
