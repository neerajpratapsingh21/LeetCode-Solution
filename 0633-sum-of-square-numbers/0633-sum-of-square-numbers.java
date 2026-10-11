class Solution {
    public boolean judgeSquareSum(int c) {
        long a=0;
        long b=(int)Math.sqrt(c);
        while(a<=b){
            long sum = (a*a)+(b*b);
              if((int)sum == c){
                return true;
              }else if (sum < c){
                 a++;
              }else{
                b--;
              }
        }
        return false;
    }
}