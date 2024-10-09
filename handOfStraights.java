//https://leetcode.com/problems/hand-of-straights/description

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        //Tc: O(nlogn) Sc: O(n) 
        if(hand.length % groupSize != 0) return false;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int i : hand)
        {
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        while(!map.isEmpty())
        {
            int start = map.firstKey();
            for(int j = 0; j < groupSize; j++)
            {
                int cur = start+j;
                if(!map.containsKey(cur)) return false;
                int cnt = map.get(cur);
                if(cnt == 1) map.remove(cur);
                else map.put(cur, cnt-1);
            }
        }
        return true;
    }
}
