//https://leetcode.com/problems/path-crossing/

class Solution {
    public boolean isPathCrossing(String path) {
        //Tc: O(n) Sc: O(n) 
        HashSet<String> set = new HashSet<>();
        int x = 0;
        int y = 0;
        set.add("0,0");

        for(char dir: path.toCharArray())
        {
            if(dir == 'N') y++;
            else if(dir == 'S') y--;
            else if(dir == 'E') x++;
            else if(dir == 'W') x--;
            String cur = x + "," + y;
            if(set.contains(cur)) return true;
            set.add(cur);
        }
        return false;
    }
}

