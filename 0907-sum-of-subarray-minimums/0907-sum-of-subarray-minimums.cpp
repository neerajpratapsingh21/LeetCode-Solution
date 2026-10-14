class Solution {
public:
    int sumSubarrayMins(vector<int>& arr) {
       int n = arr.size();
       long long MOD = 1e9 + 7;
       vector<int>pse(n,-1),nse(n,n);
       stack<int>st;

       for(int i = 0 ; i<n ;i++)
       {
            while(!st.empty() && arr[st.top()]>arr[i]) st.pop();

            if(!st.empty()) pse[i] = st.top();

            st.push(i);
       }

       stack<int>st2;
       for(int i = n-1 ; i>=0 ;i--)
       {
            while(!st2.empty() && arr[st2.top()]>=arr[i]) st2.pop();

            if(!st2.empty()) nse[i] = st2.top();

            st2.push(i);
       }

       long long ans = 0;
        for (int i = 0; i < n; i++) 
        {
            long long left = i - pse[i];
            long long right = nse[i] - i;
            ans = (ans + (arr[i] * left % MOD) * right % MOD) % MOD;
        }


       return ans;
    }
};