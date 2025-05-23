class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        
        long sum = 0;
        int  count = 0;
        long  minLoss = Long.MAX_VALUE;

        for(long num : nums){
           if((num ^ k) > num){
             count++;
             sum += (num ^ k);
           }else{
            sum += num;
           }

           minLoss = Math.min(minLoss , (int)Math.abs(num - (num ^ k)));
        }
        if(count % 2 == 0){
            return sum; 
        }
        return  sum - minLoss; 
    }
}