class Solution {
    public int maximumPossibleSize(int[] nums) {
        
        int res = 0;
        int max = -1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= max){
               res++;
               max = nums[i];
            }
        }
        return res;
    }
}