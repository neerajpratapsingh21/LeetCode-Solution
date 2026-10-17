class Solution {
    public String reverseOnlyLetters(String s) {
         char[] chars = s.toCharArray(); 
         int low = 0 ;
         int high = chars.length - 1;
         while(low < high){
            char ch1 = chars[low];
            char ch2 = chars[high];
            if(low < high && !Character.isLetter(ch1)) low++;
            else if(low < high && !Character.isLetter(ch2)) high--;
            else{
                char temp = chars[low];
                chars[low]=chars[high];
                chars[high]=temp;
                low++;
                high--;
            }
         }
   return new String(chars);
    }
}