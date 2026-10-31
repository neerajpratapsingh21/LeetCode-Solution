class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int l = 0;
        int maxlen = 0;
        int maxfreq = 0;
        Map<Character,Integer> map = new HashMap<>();
          for(int r = 0; r<n; r++){
          map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
          maxfreq = Math.max(maxfreq,map.get(s.charAt(r)));
          int change = (r-l+1) - maxfreq;
          if(change > k){
            map.put(s.charAt(l),map.get(s.charAt(l))-1);
            if(map.get(s.charAt(l))==0) map.remove(s.charAt(l));
            l++;
          }
          if(change <= k){
            maxlen = Math.max(maxlen, r- l + 1);
          }
          }
          return maxlen;
    }
}