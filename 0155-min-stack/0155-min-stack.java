class MinStack {
    private Deque<Long> st = new ArrayDeque<>();
          long min = 0;
    public void push(int val) {
       if(st.isEmpty()) {
        min = val;
        st.push((long)val);
       }
       else{
        if(min < val) st.push((long)val);
        else{
          st.push(2L*val - min);
          min = val;
        }
       }
    }
    
    public void pop() {
       if(st.isEmpty()) return ;
       long x = st.pop();
       if(x < min ){
        min = 2*min - x;
       }
    }
    
    public int top() {
      if(st.isEmpty()) return -1 ;
      long x = st.peek();
       return (int)Math.max(x,min);
    }
    
    public int getMin() {
      return (int)min;
}
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */