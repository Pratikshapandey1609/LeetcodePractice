class Solution {
    public boolean isValid(String word) {
        int n = word.length();
        if(n < 3){
            return false;
        }

        int consonants = 0;
        int vowles = 0;

        for(char ch : word.toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiouAEIOU".indexOf(ch) != -1){
                    vowles++;
                }else{
                   consonants++;
                }
            }else if(!Character.isDigit(ch)){
                return false;
            }
        }
        return vowles >= 1 && consonants >= 1;
    }
}