290. Word Pattern
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
  
Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false

class Solution {
  //Tc: O(m+n) and Sc: O(m+n)
  public boolean wordPattern(String pattern, String s) {
        String words[] = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        for(int i = 0; i < pattern.length();i++)
        {
            char ch = pattern.charAt(i);
            String w = words[i];
            if(map.containsKey(ch))
            {
                if(!map.get(ch).equals(w)) return false;
            }
            else
            {
                if (map.containsValue(w)) { //Ex: pattern: ab and the string s: cat cat
                    return false;
                }
                map.put(ch,w);
            }
        }
        return true;
    }
}
