class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hmap = new HashMap<>();
        for(String str: strs)
        {
            char stArr[] = str.toCharArray();
            Arrays.sort(stArr);
            String sort = String.valueOf(stArr);
            if(!hmap.containsKey(sort))
            {
                hmap.put(sort,new ArrayList<>());
            }
            hmap.get(sort).add(str);
        }
        return new ArrayList<>(hmap.values());

    }
}