class Solution {
    // Example :- s :egg t: add //True
    //Example :- s: egga t: pddp //False
    //Example :- s: boothb t: psiaqp // False
    public boolean isIsomorphic(String s, String t) {
        //Using a hashmap and a hashset solution
        HashMap<Character, Character> hmap= new HashMap<>();
        HashSet<Character> hset = new HashSet<>();
        for(int i = 0 ; i < s.length();i++)
        {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(hmap.containsKey(schar))
            {
                if(hmap.get(schar) !=tchar) return false;
            }
            else
            {
                if(hset.contains(tchar)) return false;
                hmap.put(schar, tchar);
                hset.add(tchar);
            }

        }
        //Using 2 hashmaps solution
        /*
        HashMap<Character, Character> smap= new HashMap<>();
        HashMap<Character, Character> tmap= new HashMap<>();
        if(s.length() != t.length()) return false;
        for(int i = 0 ; i < s.length();i++)
        {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(smap.containsKey(schar))
            {
                if(smap.get(schar) != tchar) return false;
            }
            else
            {
                smap.put(schar,tchar);
            }
            if(tmap.containsKey(tchar))
            {
                if(tmap.get(tchar) != schar) return false;
            }
            else
            {
                tmap.put(tchar,schar);
            }
        }
        return true;
       */
       return true;
    }
}