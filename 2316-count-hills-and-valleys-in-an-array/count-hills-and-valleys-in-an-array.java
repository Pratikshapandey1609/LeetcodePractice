class Solution {
    public int countHillValley(int[] nums) {

    //     int count = 0;
    //     for(int i = 1; i < nums.length-1; i++){

    //         if(nums[i] == nums[i-1]) continue;

    //         int left = i - 1 ;
    //         int right = i + 1;

    //         // Find right different value
    //         while(left >= 0 && nums[left] == nums[i]){
    //             left--;
    //         }
            
    //         // Find right different value
    //         while(right < nums.length && nums[right] == nums[i]){
    //             right--;
    //         }
    //         if(left >= 0 && right < nums.length){
    //             if(nums[i] > nums[left] && nums[i] > nums[right]){
    //                 count++;
    //             }else if(nums[i] < nums[left] && nums[i] < nums[right]){
    //                count++;
    //             }
    //         }
    //     }
    //     return count;
    // }

    // correct one 
    int count = 0;
    int left = 0;
    // int right = nums[i] + 1;
    for(int i = 1; i < nums.length - 1; i++){
        if(nums[i] != nums[i + 1]){
            if((nums[i] > nums[left] && nums[i] > nums[i + 1]) ||
              (nums[i] < nums[left] && nums[i] < nums[i + 1])){
               count++;
            }

            left = i;
        }
    }
    return count;
    }
}