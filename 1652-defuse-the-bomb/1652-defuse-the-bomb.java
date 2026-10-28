class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int ans[] = new int[n];
        int sum = 0;
        if(k==0) {
            return ans;
        }else if( k > 0){
            for(int i=1;i<=k;i++){
            sum += code[i];
            }
            ans[0]=sum;
            for(int i = 1;i <n;i++){
                sum = sum - code[i]+ code[(i+k)%n];
                ans[i]=sum;
            }
        }else{
             for(int i=n-1;i>=n+k;i--){
            sum += code[(i-1+n)%n];
            }
            ans[n-1]=sum;
            for(int i = n-2;i >= 0;i--){
                sum = sum - code[i]+ code[(i+n+k)%n];
                ans[i]=sum;
            }
        }
        return ans;
    }
}