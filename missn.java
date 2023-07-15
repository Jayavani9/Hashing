class Solution {
    public int missingNumber(int[] nums) {

        //Using a hashset where time complexity : o(n) and space : o(n)
        HashSet<Integer> hset = new HashSet<>();
        for(int i = 0 ; i < nums.length;i++)
        {
            hset.add(nums[i]);
        }
        for(int j = 0; j <= nums.length;j++)
        {
            if(!hset.contains(j))
            {
                return j;
            }
        }


        return -1;


        /*
        //Time complexity : o(n) and space : o(1)
        int n = nums.length;
        int exp = (n*(n+1))/2;
        int sum = 0;
        for(int num:nums){
            sum += num;
        }
        return exp -sum;
        */
    }
}