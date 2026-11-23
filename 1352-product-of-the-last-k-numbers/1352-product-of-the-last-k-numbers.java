class ProductOfNumbers {
     List<Integer> arr;
     int ind  = 0;
    public ProductOfNumbers() {
       arr =  new ArrayList<>();
    }
    
    public void add(int num) {
        arr.add(num);
        ind++;
    }
    
    public int getProduct(int k) {
        int n = arr.size();
        int prod = 1;
        for(int  i =n-k; i<n;i++ ){
        prod *= arr.get(i); 
        if(prod == 0) return 0;
        }
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */