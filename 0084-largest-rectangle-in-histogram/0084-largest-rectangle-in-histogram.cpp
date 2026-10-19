class Solution {
public:
    int largestRectangleArea(vector<int>& arr) {
        int n= arr.size();
         vector<int> pse(n);
        vector<int> nse(n);
       stack<int>st;
       for(int i = 0 ; i<n ;i++){
            while(!st.empty() && arr[st.top()]>=arr[i]) st.pop();
            if(!st.empty()) pse[i] = st.top();
            else pse[i] = -1;
            st.push(i);
       }
       stack<int>st2;
       for(int i = n-1 ; i>=0 ;i--) {
            while(!st2.empty() && arr[st2.top()]>=arr[i]) st2.pop();
            if(!st2.empty()) nse[i] = st2.top();
            else nse[i] = n;
            st2.push(i);
       }
       int res = 0 ;
       for(int i=0;i<n;i++){
        int area = (nse[i]-pse[i]-1) * arr[i];
        if(res < area){
            res = area ;
        }
       }
       return res;
    }
};