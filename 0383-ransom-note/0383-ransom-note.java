class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        int[] a = new int[26];
        for(int i=0;i<magazine.length();i++){
            a[magazine.charAt(i)-'a']++;
        }
         for(int i=0;i<ransomNote.length();i++){
           if(a[ransomNote.charAt(i)-'a'] != 0) a[ransomNote.charAt(i)-'a']--;
           else return false;
        }
        return true;
    }
}