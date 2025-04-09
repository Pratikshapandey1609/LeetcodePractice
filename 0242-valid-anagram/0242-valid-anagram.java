class Solution {
    public boolean isAnagram(String s, String t) {
        
        // checking length of both string if length is equal there is possibility its Anagram 
        if(s.length() != t.length()){
            return false;
        }

        // using one array initially all values is 0
        int [] count = new int[26];

        for(int i = 0; i < s.length(); i++){
            // in string s if we found character increase the value of that index by 1
            count[s.charAt(i) - 'a'] ++;
            // in string s if we found character decrease its value by 1 
            count[t.charAt(i) - 'a']--;
        } 

        for(int value : count){
            if (value != 0){
                return false;
            }
        }
        return true;
    }
}