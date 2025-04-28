class Solution {
    public boolean isHappy(int n) {

        int slow = n;
        int fast = n;
        
        do{
            slow = Square(slow);
            fast = Square(Square(fast));

        } while(slow !=  fast);

        if(slow == 1){
          return true;
        }
        return false;
    }

    public int Square(int num){
        int ans = 0;

        while(num  > 0){

           int reminder  = num % 10;
           ans += reminder * reminder;
           num /= 10;

        }
        return ans;
    }
}