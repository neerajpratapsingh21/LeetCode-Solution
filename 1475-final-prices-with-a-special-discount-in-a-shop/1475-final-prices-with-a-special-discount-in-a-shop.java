class Solution {
    public int[] finalPrices(int[] arr) {
      int n= arr.length;
    int[] ans = new int [n];
    Deque<Integer> st = new ArrayDeque<>();
    for(int i=n-1;i>=0;i--){
       while(!st.isEmpty() && st.peek() > arr[i]) st.pop();
       if(st.isEmpty()) ans[i]=arr[i];
       else ans[i]=arr[i] - st.peek();

       st.push(arr[i]);
        }
        
        
    
    return ans;
    }
}