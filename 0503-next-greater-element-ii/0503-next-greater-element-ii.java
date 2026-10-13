class Solution {
    public int[] nextGreaterElements(int[] arr) {
      int n= arr.length;
    int[] ans = new int [n];
    Deque<Integer> st = new ArrayDeque<>();
    
    for(int i=n-1;i>=0;i--){
       while(!st.isEmpty() && st.peek() <= arr[i]) st.pop();
       if(!st.isEmpty()) ans[i]=st.peek();
      else{
        int j=(i+1) % n;
        while( i != j){
            if(arr[j]> arr[i]){
                ans[i] = arr[j];
                break;
            }
            j=(j+1) % n;
        }
        if(i==j) ans[i]=-1;
      }
       st.push(arr[i]);
        }
    return ans;
    }
}