class Solution {
   
  public char getVal(char ch){
    
    switch (ch){
        
        case ']':return '['; 
        case '}':return '{'; 
        case ')':return '('; 
        default : return '\0'; 
    }
 } 
  
 public boolean isValid(String s) {
        String Opening ="({[ "; 
        String close ="]})";
      
    Stack<Character>st= new Stack <>(); 
      
 for(char ch :s.toCharArray()){
       
    if (Opening.indexOf(ch)!=-1)
         st.push(ch); 
       
    else{
      
      if(st.size()==0)
        return false; 
      
         char temp =st.pop(); 
          if (getVal(ch)!=temp)
            return false; 
        
        }
      }
      
     return st.size()==0; 
   
   }
} 

