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
