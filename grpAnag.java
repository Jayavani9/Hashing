class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> hmap = new HashMap<>();
        for(String s: strs)
        {
            double pr = prprod(s);
            if(!hmap.containsKey(pr))
            {
                hmap.put(pr,new ArrayList<>());
            }
            hmap.get(pr).add(s);
        }

        return new ArrayList<>(hmap.values());
    }
        /*
        HashMap<String,List<String>> hmap = new HashMap<>();
        for(String str: strs)
        {
            char stArr[] = str.toCharArray();
            Arrays.sort(stArr);
            String sort = new String(stArr);
            //String sort = String.valueOf(strArr);
            if(!hmap.containsKey(sort))
            {
                hmap.put(sort,new ArrayList<>());
            }
            hmap.get(sort).add(str);
        }
        return new ArrayList<>(hmap.values());
        */

        private double prprod(String s)
        {
            int primes[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
            double res = 1;
            for(int i = 0 ; i < s.length();i++)
            {
                char ch = s.charAt(i);
                res = res * primes[ch-'a'];
            }
            return res;
        }
    }