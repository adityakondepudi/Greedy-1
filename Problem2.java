//Time Complexity : O(k^n)
//Space Complexity: O(1)
class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n==1) return 0;
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(0);
        visited.add(0);
        int jumps = 1;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                int curr = q.poll();
                for(int j=1; j <= nums[curr]; j++){
                    int child = curr + j;
                    if(child == n-1){
                        return jumps;
                    }
                    if(!visited.contains(child)){
                        q.add(child);
                        visited.add(child);
                    }
                }
            }
            jumps++;
        }
        return 5;
    }
}
