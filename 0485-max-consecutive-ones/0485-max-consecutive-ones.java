class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int Maximum = 0;
        int CurrCount = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                CurrCount++;  // increase CurrCount to 1 

                if(CurrCount > Maximum){
                    Maximum = CurrCount;
                }
            }
            else{
                CurrCount = 0;  // if 0 found reset CurrCount to 0
            }
        }
        return Maximum;
    }
}