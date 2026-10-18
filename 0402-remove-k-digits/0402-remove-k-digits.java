class Solution {
    public String removeKdigits(String num, int k) {
         int n = num.length();
         if(n == k) return "0";
          int i = 0 ;
         
          StringBuilder st = new StringBuilder();
          while( i < n){
            char ch = num.charAt(i);
             while(!st.isEmpty() && k != 0 && ch < st.charAt(st.length()-1)){
                st.deleteCharAt(st.length()-1);
                k--;
             }
                 i++;
             if(st.isEmpty() && ch == '0')  continue;
             st.append(ch);
         
          }
          while(!st.isEmpty() && k != 0 ){
            st.deleteCharAt(st.length()-1);
             k--;
          }
          if(st.isEmpty()) return "0";
           return st.toString();
    }
}