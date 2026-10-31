class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();

        int maxlen = 0 ;
        int l = 0;
        int prefixcost[]= new int[n];
        for(int i = 0; i<n; i++){
           int cost = Math.abs(s.charAt(i) - t.charAt(i));
             prefixcost[i] = cost;
            maxCost -= cost;
            while(l <= i  && maxCost < 0){
                maxCost += prefixcost[l];
                l++;
            }
             
            maxlen = Math.max(maxlen,i-l+1);
            
        }
        return maxlen;
    }
}