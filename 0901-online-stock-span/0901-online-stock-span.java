class StockSpanner {
    private Stack<int[]> stack;
    int ind;
    public StockSpanner() {
        stack = new Stack<>();
        ind = 0;
    }

    public int next(int price) {
       ind = ind + 1 ;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            stack.pop(); 
        }
        int ans = ind - (stack.isEmpty() ? 0 : stack.peek()[1]);
        stack.push(new int[]{price, ind});
        return ans;
    }
}