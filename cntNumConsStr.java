//https://leetcode.com/problems/count-the-number-of-consistent-strings/?envType=daily-question&envId=2024-09-12

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        //Tc: O(m*n) Sc: O(m) 
        HashSet<Character> set = new  HashSet<>();

        for(int i = 0; i < allowed.length(); i++)
        {
            set.add(allowed.charAt(i));
        }

        int cnt = 0;

        for(String word: words)
        {
            boolean flag = true;

            for(int i = 0; i < word.length(); i++)
            {
                char cur = word.charAt(i);

                if(!set.contains(cur))
                {
                    flag = false;
                    break;
                }
            }
            if(flag) cnt++;
        }
        return cnt;
    }
}
