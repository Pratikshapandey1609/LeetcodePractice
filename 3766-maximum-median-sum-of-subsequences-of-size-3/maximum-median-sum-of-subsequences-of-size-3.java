class Solution {
    public long maximumMedianSum(int[] nums) {

        // sort in ascending order
         Arrays.sort(nums);
        
         int n = nums.length;
         long sum = 0;
         int count = n / 3; // length / 2 (6 / 3 = 2)  2 groups of triplets 

        // start from (n-2) last s second largest 
        int index = n - 2;
        
        for(int i = 0; i < count; i++){
            sum += nums[index];
            index -= 2;
        }  
        return sum;
    }
}