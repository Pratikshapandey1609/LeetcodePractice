class Solution {
    public int characterReplacement(String s, int k) {

        int len =  s.length();
        int []  count = new int[26];
        int left = 0;
        int maxCount = 0;
        int maxLength = 0;

        for(int right = 0; right < len;right ++){
            maxCount = Math.max(maxCount  , ++count[s.charAt(right) - 'A']);

            while(right - left +1 - maxCount > k){
                count[s.charAt(left) - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength , right - left +1);
        }
        return maxLength;
    }
}