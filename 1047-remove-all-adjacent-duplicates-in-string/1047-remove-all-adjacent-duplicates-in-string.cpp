class Solution {
public:
    string removeDuplicates(string s) {
        
       
        string st;
        for(char ch : s){
            if((!st.empty() && st[st.size()-1] != ch)||st.empty()){

                st.push_back(ch);

            }else{

                while(!st.empty() && st[st.size()-1] == ch){
                    st.pop_back();
                }

            }

        }

        return st;
    }
};