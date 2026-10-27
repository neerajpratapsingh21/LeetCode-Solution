class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> seen = new HashSet<>();
        seen.add('a');
        seen.add('e');
        seen.add('i');
        seen.add('o');
        seen.add('u');
        int c = 0;
        for(int i = 0; i < k; i++){
            if(seen.contains(s.charAt(i))) c++;
        }
        
        int n = s.length();
        int maxnum = c;
        for(int i=k;i<n;i++){
            if(seen.contains(s.charAt(i))) c++;
             if(seen.contains(s.charAt(i-k))) c--;
             maxnum = Math.max(maxnum,c);
             if(c==k) return k;
        }
        return maxnum;
    }
}