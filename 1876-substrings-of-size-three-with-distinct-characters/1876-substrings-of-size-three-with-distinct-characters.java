class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length() < 3) return 0;
        Map<Character,Integer> f = new HashMap<>();
        int count = 0;
        for(int i = 0;i<3;i++){
            char c = s.charAt(i);
            f.put(c,f.getOrDefault(c,0)+1);
        }
      if( f.size()== 3) count++;
       for(int i = 3;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = s.charAt(i-3);
            f.put(c1,f.getOrDefault(c1,0)+1);
            f.put(c2,f.get(c2)-1);
            if(f.get(c2) == 0) f.remove(c2);
            if( f.size()== 3) count++; 
        }
        return count;
     }
}