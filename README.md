# Hashing

Isomor.java contains the solution to the problem : 
205. Isomorphic Strings
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

The solution is given in 2 ways:
1. Using 2 Hashmaps.
2. Using a HashMap and a HashSet.
3. Using a single HashMap

missn.java contains the solution to the problem:
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

The solution is given in 3 ways:
1. Using a HashSet // Tc: o(n); sc: o(n)
2. Using the sum of numbers concept // Tc: o(n); sc: o(1)
3. Using sort and check in range // Tc: o(nlogn); sc: o(1)

TwoSum.java contains the solution to 
1. Two Sum
Given an array of integer nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

The solution is given by using a single HashMap with time and space complexities being o(n) each.


grpAnag.java contains the solution to 
49. Group Anagrams
Given an array of strings strs, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
1. Using HashMap and Sorting ; Tc : O(n*klogk)
2. Using Prime product and HashMap

