//Checking if 2 string are isomorphic or not with the help of 2 HashMap's.
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();
        if(s.length() != t.length()) return false;
        for(int i = 0 ; i < s.length();i++)
        {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if(smap.containsKey(cs))
            {
                if(smap.get(cs) != ct) 
                {
                    return false;
                }
            }
            else 
            {
                smap.put(cs,ct);
            }
            if(tmap.containsKey(ct))
            {
                if(tmap.get(ct) != cs) return false;
            }
                else 
                {
                    tmap.put(ct,cs);
                }

        }
        return true;
    }
}