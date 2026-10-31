class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int l = 0;
        int maxlen = 0;
        int maxfreq = 0;
        int freq[] = new int[26];
          for(int r = 0; r<n; r++){
          freq[s.charAt(r)-'A']++;
          maxfreq = Math.max(maxfreq,freq[s.charAt(r)-'A']);
          int change = (r-l+1) - maxfreq;
          if(change > k){
            freq[s.charAt(l)-'A']--;
            l++;
          }
          if(change <= k){
            maxlen = Math.max(maxlen, r- l + 1);
          }
          }
          return maxlen;
    }
}