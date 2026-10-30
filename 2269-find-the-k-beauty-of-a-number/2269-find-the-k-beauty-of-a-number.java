class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int c = 0;
        int l = 0;
        for(int r = 0;r < s.length();r++){
            if(r >= k-1){
                int x = Integer.parseInt(s.substring(l,r+1));
                if ( x != 0 && num % x == 0) c++;
                l++;
            }
        }
        return c;
    }
}