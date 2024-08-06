//https://leetcode.com/problems/happy-number/

//Tc: O(logn) Sc: O(c) 
class Solution {
    private int nextNum(int n)
    {
        int ans = 0;
        while(n > 0)
        {
            int num = n%10;
            n /= 10;
            ans += num*num;
        }
        return ans;
    }

    public boolean isHappy(int n) {

        HashSet<Integer> set = new  HashSet<>();
        while(n != 1 && !set.contains(n))
        {
            set.add(n);
            n = nextNum(n);
        }
        return n == 1;
    }
}
