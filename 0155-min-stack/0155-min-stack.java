class MinStack {
    private Stack<Integer> val;
    private Stack<Integer> minimum;
 
    public MinStack() {
        val = new Stack<>();
        minimum = new Stack<>();
    }
    public void push(int value) {
       val.push(value);
       if(minimum.isEmpty()){
        minimum.push(value);
       }else{
        minimum.push(Math.min(value,minimum.peek()));
       }
    }
    
    public void pop() {
        val.pop();
        minimum.pop();
    }
    
    public int top() {
        return val.peek();
    }
    
    public int getMin() {
        return minimum.peek();
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