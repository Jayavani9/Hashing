//https://leetcode.com/problems/perfect-squares/

class Solution {
    public int numSquares(int n) {
        //Tc: O(n*sqrt(n))  Sc: O(n) 
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 1; i * i <= n; i++)
        {
            nums.add(i*i);
        }

        Set<Integer> q = new HashSet<>();
        q.add(n);

        int ans = 0;
        while(q.size() > 0)
        {
            ans += 1;
            Set<Integer> next = new HashSet<>();
            for(Integer rem: q)
            {
                for(Integer sq: nums)
                {
                    if(rem.equals(sq)) return ans;
                    else if(rem < sq) break;
                    else next.add(rem - sq);
                }
            }
            q = next;
        }
        return ans;
    }
}
