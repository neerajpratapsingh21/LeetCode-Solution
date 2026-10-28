class Solution {
    public int minimumRecolors(String blocks, int k) {
      int n = blocks.length();
      int c = 0;
      for(int r = 0; r < k; r++){
        if(blocks.charAt(r) == 'W') c++;
      } 
      int minc = c;
      for(int r = k; r < n; r++){
         if(blocks.charAt(r) == 'W') c++;
          if(blocks.charAt(r-k) == 'W') c--;
        if(minc > c){
            minc = c;
        }
      }
      return minc;
    }
}