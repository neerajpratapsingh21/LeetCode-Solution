class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s2.length();
        int k = s1.length();
        if(k == 1) return s2.contains(s1);
        if( n < k) return false;
        int a[] = new int[26];
        int b[] = new int[26];
        for(int i = 0; i < k; i++){
            a[s1.charAt(i)-'a']++;
            b[s2.charAt(i)-'a']++;
        }
        for(int i = 0; i < 26; i++){
                if(a[i] != b[i]) break;
                if(i == 25) return true;
            }
        int l = 0;
        int r = k;
        boolean yes = false;
        while( r < n ){
            b[s2.charAt(r)-'a']++;
            b[s2.charAt(l)-'a']--;

            for(int i = 0; i < 26; i++){
                if(a[i] != b[i]) break;
                if(i == 25) yes = true;
            }
            if(yes) return true;
            r++;
            l++;
        }
        return false;
    }
}