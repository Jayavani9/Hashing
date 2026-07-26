792. Number of Matching Subsequences
Tc: O(n + Tlogn) Sc: O(n)
  class Solution {

    public int numMatchingSubseq(String s, String[] words) {
        if(s.length() == 0) return 0;
        HashMap<Character, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++)
        {
            map.putIfAbsent(s.charAt(i), new ArrayList<>());
            map.get(s.charAt(i)).add(i);
        }
        int res = 0;
        for(String word: words)
        {
        if(isValid(map, word)) res++;
        }
        return res;
    }
    private boolean isValid(HashMap<Character, List<Integer>> map, String word)
    {
        int prevInd = -1;
        for(int i = 0; i < word.length(); i++)
        {
            if(!map.containsKey(word.charAt(i))) return false;
            List<Integer> positions = map.get(word.charAt(i));
            int ind = findIndex(positions, prevInd);
            if(ind == -1) return false;
            prevInd = ind;
        }
        return true;
    }

    private Integer findIndex(List<Integer> positions, int prevInd)
    {
        int left = 0;
        int right = positions.size()-1;
        int ans = -1;
        while(left <= right)
        {
            int mid = left + (right - left) / 2;
            if(positions.get(mid) > prevInd)
            {
                ans = positions.get(mid);
                right = mid-1;
            }
            else left = mid+1;
        }
        return ans;
    }
}


/*
class Solution {

    public int numMatchingSubseq(String s, String[] words) {

        Map<Character, List<Integer>> map = new HashMap<>();

        // Store every character's positions in s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            map.putIfAbsent(ch, new ArrayList<>());
            map.get(ch).add(i);
        }

        int count = 0;

        for (String word : words) {
            if (isSubsequence(word, map)) {
                count++;
            }
        }

        return count;
    }

    private boolean isSubsequence(
            String word,
            Map<Character, List<Integer>> map) {

        int previousIndex = -1;

        for (char ch : word.toCharArray()) {

            // Character does not exist in s
            if (!map.containsKey(ch)) {
                return false;
            }

            List<Integer> positions = map.get(ch);

            boolean found = false;

            // Find the first position after previousIndex
            for (int position : positions) {
                if (position > previousIndex) {
                    previousIndex = position;
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}
*/
/*
class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        if(s.length() == 0) return 0;
        int cnt = 0;
        for(int i = 0; i < words.length; i++)
        {
            if(isValid(s, words[i]))
            {
                cnt++;
            }
        }
        return cnt;
    }

    private boolean isValid(String s, String inp)
    {
        int i = 0, j = 0;
        while(i < s.length() && j < inp.length())
        {
            if(s.charAt(i) == inp.charAt(j))
            {
                j++;
            }
            i++;
        }
        return j == inp.length();
    }
}
*/
