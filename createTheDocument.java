You are given a sequence of available characters and a string that represents the document you need to create. 
Write a function that determines whether you can create a document with the available characters. 
If you can create the document, the function should return true; otherwise it should return false.

You can create a document only if the frequency of unique characters in the string is greater than or equal to the frequency of unique characters in the document string. 
For example, if you get characters = "abcabc" and document = "aabbccc", you cannot create a document because you are missing one c.

The created document can contain any characters, including special characters, capital letters, numbers and spaces.

Note: You can always create an empty string ("").

Sample Input
characters = "Bste!hetsi ogEAxpelrt x "
document = "AlgoExpert is the Best!"
  
Sample Output
true
    
