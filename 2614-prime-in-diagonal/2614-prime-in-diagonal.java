class Solution {
    boolean isPrime(int n){
        if(n < 2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int n =  nums.length;
    int maxprime = 0;
    for(int i=0;i<n;i++){
      if(isPrime(nums[i][i])) maxprime = Math.max(maxprime,nums[i][i]);
      if(isPrime(nums[i][n-1-i])) maxprime = Math.max(maxprime,nums[i][n-1-i]);
    }
    return maxprime;
    }
}