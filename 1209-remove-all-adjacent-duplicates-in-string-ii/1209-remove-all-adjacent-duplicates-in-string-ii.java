class Solution {
    public String removeDuplicates(String s, int k) {
          int n = s.length();
        Deque<Map<Character,Integer>> st = new ArrayDeque<>();
        for(int i = 0; i < n; i++){
            char curr = s.charAt(i);
            if(!st.isEmpty() && st.peek().containsKey(curr)){
                if(st.peek().get(curr) == k-1){
                    st.pop();
                    continue;
                }else{
                    st.peek().put(curr,st.peek().get(curr)+1 );
                }
            }else{ Map<Character, Integer> map = new HashMap<>();
            map.put(curr, 1);
            st.push(map);
        }
    }

    StringBuilder sb = new StringBuilder();
    for (Map<Character, Integer> map : st) {
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            sb.append(String.valueOf(ch).repeat(count));
        }
    }

    // Fix 3: ArrayDeque iterates top-to-bottom, so reverse the result
    return sb.reverse().toString();
    }
}
