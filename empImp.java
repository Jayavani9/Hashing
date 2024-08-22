//https://leetcode.com/problems/employee-importance/

/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

//Using BFS
class Solution {
    //Tc: O(n)  Sc: O(n) 
    HashMap<Integer, Employee> map = new HashMap<>();
    public int getImportance(List<Employee> employees, int id) {
        int ans = 0;
        for(Employee e: employees)
        {
            map.put(e.id,e);
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(id);
        while(!q.isEmpty())
        {
            int eid = q.poll();
            Employee emp = map.get(eid);
            ans += emp.importance;
            for(int subOrd: emp.subordinates){
                q.add(subOrd);
            }
        }
        return ans;
    }
}
