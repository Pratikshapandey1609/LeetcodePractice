class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n = nums.length;
        Deque <Integer> q = new ArrayDeque<>();
        List  <Integer> res = new ArrayList<>();

        for(int i = 0; i < n; i++){
            while(!q.isEmpty() && nums[q.getLast()] <= nums[i]){
                q.removeLast();
            }
            q.addLast(i);
            if(q.getFirst() == i-k ){
                q.removeFirst();
            }

            if(i >= k - 1){
               res.add(nums[q.peek()]); 
            }
        }
        return res.stream().mapToInt(i->i).toArray();   
    }
}

