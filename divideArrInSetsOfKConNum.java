//https://leetcode.com/problems/divide-array-in-sets-of-k-consecutive-numbers/description/

class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        //Tc: O(nlogn) Sc: O(n) 
        int n = nums.length;
        if(n%k != 0) return false;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i : nums)
        {
            map.put(i, map.getOrDefault(i,0)+1);
        }

        while(!map.isEmpty())
        {
            int begin = map.firstKey();
            for(int j = 0; j < k; j++)
            {
                int cur = begin + j;
                if(!map.containsKey(cur)) return false;

                int cnt = map.get(cur);
                if(cnt == 1) map.remove(cur);
                else map.put(cur, cnt-1);
            }
        }
        return true;
    }
}
