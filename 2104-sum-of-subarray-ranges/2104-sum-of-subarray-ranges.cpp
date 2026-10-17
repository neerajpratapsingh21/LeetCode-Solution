class Solution {
    public:
    long long sumSubarrayMins(vector<int>& arr) {
       int n = arr.size();
       vector<int> pse(n);
        vector<int> nse(n);
       stack<int>st;
       for(int i = 0 ; i<n ;i++){
            while(!st.empty() && arr[st.top()]>arr[i]) st.pop();
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
       long long ans = 0;
        for (int i = 0; i < n; i++)  {
            long long left = i - pse[i];
            long long right = nse[i] - i;
            ans = ans + (arr[i] * left* right);
        }
       return ans;
    }
    public:
    long long sumSubarrayMaxs(vector<int>& arr) {
       int n = arr.size();
       vector<int> pge(n);
        vector<int> nge(n);
       stack<int>st;
       for(int i = 0 ; i<n ;i++) {
          while(!st.empty() && arr[st.top()]<arr[i]) st.pop();
            if(!st.empty()) pge[i] = st.top();
            else pge[i] = -1;
            st.push(i);
       }
       stack<int>st2;
       for(int i = n-1 ; i>=0 ;i--) {
            while(!st2.empty() && arr[st2.top()]<=arr[i]) st2.pop();
            if(!st2.empty()) nge[i] = st2.top();
            else nge[i] = n;
            st2.push(i);
       }
       long long ans = 0;
        for (int i = 0; i < n; i++)  {
            long long left = i - pge[i];
            long long right = nge[i] - i;
            ans = ans + (arr[i] * left * right);
        }
       return ans;
    }
public:
    long long subArrayRanges(vector<int>& nums) {
         return sumSubarrayMaxs(nums) -  sumSubarrayMins(nums);
    }
};