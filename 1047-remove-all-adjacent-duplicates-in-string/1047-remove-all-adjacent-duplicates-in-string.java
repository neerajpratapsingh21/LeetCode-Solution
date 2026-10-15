class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> st = new ArrayDeque<>();
        
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && st.peek() == s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder ans = new StringBuilder();

        while(!st.isEmpty()) {
        ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}