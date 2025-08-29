class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || x % 10 == 0 && x!=0) return false;

        int revhalf=0; //stores the right half of a number and then it is compared with the other half
        while(x>revhalf)
        {
          int last = x % 10;
          revhalf = revhalf * 10 + last;
          x = x / 10; 
        }
        return x == revhalf || x == revhalf / 10; //for odd & even no. of digits
    }
}