class Solution {
    public void reverseString(char[] s) {
     
     // in this method we are swaping character 
     // left pointer is start from 0 right pointer start from length -1

      int left = 0;
      int right = s.length - 1;

      while(left < right){
        
        // swap characters at left and right
    
        char temp = s[left];
        s[left]   = s[right];
        s[right]  = temp;

        left++;
        right--;

      }
    }
}