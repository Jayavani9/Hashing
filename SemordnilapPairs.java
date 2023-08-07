Create a function that accepts a list of unique strings as input. 
The function should identify and return a new list containing pairs of strings called "semordnilap pairs." 
A semordnilap pair is defined as a pair of distinct strings where one string is the reverse of the other. 
For example, if the input list contains the strings "diaper" and "repaid," they form a semordnilap pair since "repaid" is the reverse of "diaper".
Similarly, if the input list contains the strings "palindromes" and "semordnilap," they also form a semordnilap pair.

The order of the pairs in the output list does not matter, and neither does the order of the strings within each pair.

Sample Input
words = ["diaper", "abc", "test", "cba", "repaid"]
    
Sample Output
[["diaper", "repaid"], ["abc", "cba"]]

class Program {
  public static ArrayList<ArrayList<String>> semordnilap(String[] words) {
    // Write your code here.
    //Tc: O(m*n) where m = avg length of words and n = no of words;Sc: O(n) 
     ArrayList<ArrayList<String>> pairs = new ArrayList<>();
     Map<String, String> seen = new HashMap<>();
     for(String word:words)
     {
         String rev = new StringBuilder(word).reverse().toString();
         if(seen.containsKey(rev))
         {
             ArrayList<String> pair = new ArrayList<>();
             pair.add(seen.get(rev));
             pair.add(word);
             pairs.add(pair);
         }
         seen.put(word, rev);
     }
    
    return pairs;
  }
}
