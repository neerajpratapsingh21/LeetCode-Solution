class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int c = 0;
        int[] hash = new int[3];
        hash[0]=-1;
        hash[1]=-1;
        hash[2]=-1;
            for(int i = 0;i<n;i++){
            int ch = s.charAt(i)-'a';
             if(ch == 0) hash[0] = i;
             if(ch == 1) hash[1] = i;
             if(ch == 2) hash[2] = i;

             if(hash[0] != -1 && hash[1] != -1 && hash[2] != -1){
                int mini = Math.min(hash[0],Math.min(hash[1],hash[2]));
                c += mini+1;
             }
            }
        
            return c;
    }
}