383. Ransom Note
  
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.

Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false
  
Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

class Solution {
    //Tc: O(m+n) and Sc: O(m)
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i = 0 ; i < magazine.length();i++)
        {
            char ch = magazine.charAt(i);
            hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
           

        }
        for(int i = 0 ; i < ransomNote.length();i++)
        {
            char ch = ransomNote.charAt(i);
            if(hmap.containsKey(ch))
            {
                int cnt = hmap.get(ch);
                if(cnt > 0)
                {
                    hmap.put(ch,cnt-1);
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
           return true;
    }
}
