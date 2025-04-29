class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int evenIndex = 0;
        int oddIndex  = 1;
        int [] result = new int[nums.length];

        for(int num = 0; num < nums.length; num++){

            if(nums[num] % 2 == 0){
                result[evenIndex] = nums[num];
                evenIndex += 2;
            }
            else{
                result[oddIndex] = nums[num];
                oddIndex += 2;
            }
        }
        return result;
    }
}