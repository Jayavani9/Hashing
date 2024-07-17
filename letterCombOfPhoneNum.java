//https://leetcode.com/problems/letter-combinations-of-a-phone-number/

//Tc: O(4^n) Sc: O(4^n)
class Solution {
     HashMap<Character, String> map = new HashMap<>();
      private List<String> ans;
      
    public List<String> letterCombinations(String digits) {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        ans = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return ans;
        }
        backtrack(new StringBuilder(), digits, 0);
        return ans;
        
    }

      private void backtrack(StringBuilder cur, String digits, int index) {

        if (index == digits.length()) {
            ans.add(cur.toString());
            return;
        }

        String letters = map.get(digits.charAt(index));


        for (char letter : letters.toCharArray()) {

            cur.append(letter);
 
            backtrack(cur, digits, index + 1);
            cur.deleteCharAt(cur.length() - 1);
        }
      }
}




//Other way (Using a String Builder and not passing digits each time to the function as it is a constant)

class Solution {
     HashMap<Character, String> map = new HashMap<>();
      private List<String> ans;
      String dig;
    public List<String> letterCombinations(String digits) {
        dig = digits;
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        ans = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return ans;
        }
        backtrack(new StringBuilder(),0);
        return ans;
        
    }

      private void backtrack(StringBuilder cur,int index) {

        if (index == dig.length()) {
            ans.add(cur.toString());
            return;
        }

        String letters = map.get(dig.charAt(index));


        for (char letter : letters.toCharArray()) {

            cur.append(letter);
 
            backtrack(cur,index + 1);
            cur.deleteCharAt(cur.length() - 1);
        }
      }
}


//Using a string
class Solution {
     HashMap<Character, String> map = new HashMap<>();
      private List<String> ans;
      String dig;
    public List<String> letterCombinations(String digits) {
        dig = digits;
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        ans = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return ans;
        }
        backtrack("",0);
        return ans;
        
    }

      private void backtrack(String cur,int index) {
        if (index == dig.length()) {
            ans.add(cur);
            return;
        }

        String letters = map.get(dig.charAt(index));

        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.charAt(i);
            backtrack(cur + letter, index + 1);
       
        }
      }
}
