class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        if( n <= 2) return n;
        int maxlen = 0;
        int l = 0,  r = 0;
        Map<Integer,Integer> freq = new HashMap<>();
        while(r < n){
         freq.put(fruits[r],freq.getOrDefault(fruits[r],0)+1);
         while(freq.size() > 2){
            freq.put(fruits[l],freq.get(fruits[l])-1);
            if(freq.get(fruits[l])==0) freq.remove(fruits[l]);
            l++;
         }
         maxlen = Math.max(maxlen,r-l+1);
         r++;
        }
        return maxlen;
    }
}