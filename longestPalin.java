409. Longest Palindrome

Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.


Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
Example 2:

Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.
 
1. Using a HashMap
  class Solution {
    public int longestPalindrome(String s) {
      //Tc: O(n) and Sc: O(1)
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length();i++)
        {
            char ch = s.charAt(i);
            if(map.containsKey(ch)) 
            {
                map.put(ch, map.get(ch) + 1);

            }
            else
            {
                map.put(ch,1);
            }
        }
         int len = 0;
        boolean hasOddCount = false;

        for (char c : map.keySet()) {
            int frequency = map.get(c);
            if (frequency % 2 == 0) {
                len += frequency;
            } else {
                len += frequency - 1;
                hasOddCount = true;
            }
        }
        
        if (hasOddCount) {
            len++;
        }
2. HashSet(Optimal Solution)
        
        /*
        //Tc: O(n) and Sc: O(1) 
        int cnt = 0;
        HashSet<Character> hset = new HashSet<>();
        for(int i = 0; i < s.length();i++)
        {
            char c = s.charAt(i);
            if(hset.contains(c))
            {
                cnt += 2;
                hset.remove(c);
            }
            else
            {
            hset.add(c);
            }
        }
        if(!hset.isEmpty()) return cnt+1;
        else return cnt;
        */
        return len;
    }
}
