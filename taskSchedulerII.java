//https://leetcode.com/problems/task-scheduler-ii/

class Solution {
    //Tc: O(n) Sc: O(m) where m = num of unique tasks placed in the hashmap
    public long taskSchedulerII(int[] tasks, int space) {
       Map<Integer, Long> lastCompletedDay = new HashMap<>();
        long currentDay = 0;

        for (int task : tasks) {
            currentDay++;

            if (lastCompletedDay.containsKey(task)) {
                long lastDay = lastCompletedDay.get(task);
                if (currentDay - lastDay <= space) {
                    currentDay = lastDay + space + 1; 
                }
            }
            lastCompletedDay.put(task, currentDay);
        }

        return currentDay; 
    }
}
