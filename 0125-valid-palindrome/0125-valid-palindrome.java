class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1; // Two Pointer approach
  
        while(i < j)
        {
            // cleaning special characters and spaces from left & right
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i < j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            // comparing lowercase versions
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}