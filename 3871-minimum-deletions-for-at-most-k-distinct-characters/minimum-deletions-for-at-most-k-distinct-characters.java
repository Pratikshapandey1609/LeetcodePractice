class Solution {
    public int minDeletion(String s, int k) {
        
        int [] count = new int[27];
        int uni = 0;

        for(int i = 0; i < s.length(); i++){
            int  ch = s.charAt(i) - 'a';
            if(count[ch] == 0) uni++;
            count[ch]++;
        }
        Arrays.sort(count);

        int ans = 0;
        for(int i = 26; i >= 0; i--){
            if(k > 0){
                ans += count[i];
                k--;
            }else{
                break;
            }
        }
        return s.length() - ans;
    }
}