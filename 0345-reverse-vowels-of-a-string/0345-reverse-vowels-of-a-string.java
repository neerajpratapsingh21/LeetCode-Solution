class Solution {
    public String reverseVowels(String s) {
        int l = 0;
        int r = s.length()-1;
        char[] sc =s.toCharArray(); 
        
        while(l<r){
            
            while( l<r && !(sc[l]=='A'||sc[l] == 'E'||sc[l] == 'I'||sc[l] == 'O'||sc[l] == 'U'||sc[l] == 'a'||sc[l] == 'e'||sc[l] == 'i'||sc[l] == 'o'||sc[l] == 'u')){
                l++;
            }
         while(l<r && !(sc[r]=='A'||sc[r] == 'E'||sc[r] == 'I'||sc[r] == 'O'||sc[r] == 'U'||sc[r] == 'a'||sc[r] == 'e'||sc[r] == 'i'||sc[r] == 'o'||sc[r] == 'u')){
                r--;
            }
          if(l<r){
                char temp = sc[l];
                sc[l] = sc[r];
                sc[r] = temp;
                l++;
                r--;
          }
          

        }
        return new String(sc);
    }
}