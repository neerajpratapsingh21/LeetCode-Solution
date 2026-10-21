class Solution {
    public void generate(StringBuilder s, int open, int close, int n, List<String> ans){
        if(s.length()==n*2){
            ans.add(new String(s.toString()));
            return;
        }
        if(open < n ){
            s.append("(");
            generate(s,open+1,close,n,ans);
            s.deleteCharAt(s.length() - 1);
        }
        if(close < open){
            s.append(")");
            generate(s,open,close+1,n,ans);
            s.deleteCharAt(s.length() - 1);
        }
    }
    public List<String> generateParenthesis(int n) {
    List<String> ans = new ArrayList<>();
    StringBuilder s = new StringBuilder();
    generate(s,0,0,n,ans);
    return ans ;
    }
}