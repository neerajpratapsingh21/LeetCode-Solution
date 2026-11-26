class Solution {
    public boolean canAliceWin(int n) {
         if(n < 10) return false;
          int stoneToRemove = 10;
         while( n >= stoneToRemove){
              n -= stoneToRemove;
              stoneToRemove--;
         }

         return stoneToRemove % 2 == 1;
    }
}