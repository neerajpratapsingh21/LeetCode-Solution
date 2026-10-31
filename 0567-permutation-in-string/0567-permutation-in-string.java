class Solution {
    private boolean isEqual(int[] a, int[] b) {
    for(int i = 0; i < 26; i++) {
        if(a[i] != b[i]) return false;
    }
    return true;
}
    public boolean checkInclusion(String s1, String s2) {
        int n = s2.length();
        int k = s1.length();
        if( n < k) return false;
        int a[] = new int[26];
        int b[] = new int[26];
        for(int i = 0; i < k; i++){
            a[s1.charAt(i)-'a']++;
            b[s2.charAt(i)-'a']++;
        }
     if(isEqual(a, b)) return true;
        int l = 0;
        int r = k;
        while( r < n ){
            b[s2.charAt(r)-'a']++;
            b[s2.charAt(l)-'a']--;
            if(isEqual(a, b)) return true;
            r++;
            l++;
        }
        return false;
    }
}