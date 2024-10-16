//https://leetcode.com/problems/strobogrammatic-number/description/

class Solution {
    public boolean isStrobogrammatic(String num) {
        //Tc: O(n) Sc: O(n) 
        HashMap<Character, Character> map = new HashMap<>();

        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');

        int l = 0;
        int r = num.length()-1;

        while(l <= r)
        {
            if(!map.containsKey(num.charAt(l)) || map.get(num.charAt(l)) != num.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
