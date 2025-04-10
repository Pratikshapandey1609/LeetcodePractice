class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String ,List<String>> map = new HashMap<>();
    
        for(String word : strs){

          char [] Chars  = word.toCharArray();
          Arrays.sort(Chars);
          String sortedWord = new String(Chars);

          if(!map.containsKey(sortedWord)){
            map.put(sortedWord , new ArrayList<>());
          }

          map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }
}