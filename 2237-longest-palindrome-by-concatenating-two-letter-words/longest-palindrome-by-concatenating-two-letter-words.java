class Solution {
    public int longestPalindrome(String[] words) {
        
        int  n = words.length;

        int [][] freq = new int[26][26];
        int count = 0;

        for(String word : words){
            int a = word.charAt(0) - 'a';
            int b = word.charAt(1) - 'a';

            if(freq[b][a] > 0){
                freq[b][a]--;
                count+=4;
            }else{
                freq[a][b]++;
            }
        }
            for(int i = 0; i < 26; i++){
                if(freq[i][i] > 0){
                    count+=2;
                    break;
                }
            }
        return count;
    }
}