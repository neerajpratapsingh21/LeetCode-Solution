class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int ans[] = new int[n];
        if(k==0) {
            return ans;
        }else{
         for(int i = 0;i < n; i++){
            int sum = 0;
            if(k > 0){
                int j = i+1;
                while(j <= i+k){
                    sum += code[j % n];
                    j++;
                }
            }else{
                int j = i + n - 1;
                while( j >= n+k+i){
                    sum += code[j % n];
                    j--;
                } 
            }
             ans[i] = sum;
         }
        }
        return ans;
    }
}