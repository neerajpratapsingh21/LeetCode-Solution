class StockSpanner {
List<Integer> list;
int count;
    public StockSpanner() {
        list = new ArrayList<>();
        count = 1;
    }
    
    public int next(int price) {
    list.add(price);
    count = 1;
    for(int i=list.size()-2;i>=0;i--){
        if(list.get(i)  <= price) count++;
        else break;
    }
    return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */