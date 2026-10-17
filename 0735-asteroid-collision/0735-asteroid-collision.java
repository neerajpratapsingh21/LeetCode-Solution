class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Deque<Integer> st = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            if(asteroids[i]<0){
             while(!st.isEmpty()  && st.peek() > 0 && st.peek() < Math.abs(asteroids[i])){
            st.pop();
             }
             if( !st.isEmpty() && st.peek() ==  Math.abs(asteroids[i])) {
                st.pop();
                continue;
             } 
             if(  !st.isEmpty() && st.peek() >  Math.abs(asteroids[i]))   continue;   
            }
             
           st.push(asteroids[i]);      
            }
        
        int ans[]=new int[st.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=st.pollLast();
        }
        return ans;
    }
}