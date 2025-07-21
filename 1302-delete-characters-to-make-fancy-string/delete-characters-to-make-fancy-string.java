class Solution {
    public String makeFancyString(String s) {
        // ------------------ Using extra space so complexity will be  O(n)
        //------------------- Time complexity is also O(n)

        // prev points to first character 
        int prev = s.charAt(0);
        int freq = 1;
        
        // creating a new String array using  O(n) space
        StringBuilder ans = new StringBuilder();

        // append first character in new string
        ans.append(s.charAt(0));

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == prev){
                freq++;
            }else{
                prev = s.charAt(i);
                freq = 1;
            }
            if(freq < 3) ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}