class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        
        // Brute Fource Approach -----> Brute Fource Gives TLE.....
        // for(int i = 0; i < queries.length; i++){
        //     for(int j = queries[i][0];  j <= queries[i][1]; j++){
        //         if(nums[j] > 0){
        //             nums[j]--;
        //         }
        //     }
        // }
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] != 0) return false;
        // }
        // return true;

        // Efficient approach 
        // Difference Arrya technique 

        // step 1 make diff array  using query
        int n = nums.length;
        int [] diff = new int[n+1];

        for(int [] query : queries){
            int start = query[0];
            int end   = query[1];
            int x     = 1;

            diff[start] += x;
            if(end+1 < n){
                diff[end+1] -= x;
            } 
        }
        // STEP 2 find cummlative sum of each index
        int cumSum =  0;
        for(int i = 0; i < nums.length; i++){
            cumSum += diff[i];
            if(cumSum < nums[i]){
                return false;
            }
        }
        return true;
    }
}