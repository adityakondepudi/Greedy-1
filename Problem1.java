//Time Complexity  : O(k^n) 
//Space Complexity : O(1)
class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1) return true;
        HashSet<Integer> set = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        set.add(0);
        q.add(0);
        while(!q.isEmpty()){
            int i = q.poll();
            for(int j = 1; j <= nums[i]; j++){
                int child = i+j;
                if(child  == nums.length -1) return true;
                if(!set.contains(child)){
                    set.add(child);
                    q.add(child);
                }
            }
        }
        return false;
    }
}
