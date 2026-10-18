class Solution {
    public boolean isValid(String s ,String key){
    for(int i=0 ; i< s.length();i++){
        if(!key.contains(String.valueOf(s.charAt(i)))) return false;
    }
    return true;
    }
    public String[] findWords(String[] words) {
        List<Integer> ans = new ArrayList<>();
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";
        for(int i=0;i<words.length;i++){
            String s = words[i].toLowerCase();
            if(first.contains(String.valueOf(s.charAt(0))) && isValid(s,first)) {
              ans.add(i);
            }else if(second.contains(String.valueOf(s.charAt(0))) && isValid(s,second)) {
              ans.add(i);
            }else if(third.contains(String.valueOf(s.charAt(0))) && isValid(s,third)) {
              ans.add(i);
            }
        }
        String[] res = new String[ans.size()];
        for(int i= 0 ;i <ans.size();i++){
   res[i]=words[ans.get(i)];
        }
        return res ;
    }
}