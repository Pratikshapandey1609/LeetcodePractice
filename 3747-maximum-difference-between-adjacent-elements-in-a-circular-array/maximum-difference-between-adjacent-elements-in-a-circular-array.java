class Solution {
    public int maxAdjacentDistance(int[] nums) {
        
        int n = nums.length;
        int maxi = Math.abs(nums[0] - nums[n-1]);

        for(int i = 0; i < nums.length-1; i++){
            maxi = Math.max(maxi , Math.abs(nums[i] - nums[i+1]));
        }
        return maxi;
    }
}