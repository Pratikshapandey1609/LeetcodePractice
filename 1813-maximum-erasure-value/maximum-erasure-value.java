class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        int n = nums.length;
        boolean [] seen = new boolean[10001];
        int left = 0,right = 0;
        int curSum = 0;
        int maxSum = 0;

        for(right = 0; right < nums.length; right++){
            while(seen[nums[right]]){
                curSum -= nums[left];
                seen[nums[left]] = false;
                ++left;
            }
            // running sum of Array
            curSum += nums[right];
            seen[nums[right]] = true;
            if(curSum > maxSum){
                maxSum = curSum;
            }
        }
        return maxSum;
    }
}