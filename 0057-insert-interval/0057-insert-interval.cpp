class Solution {
     vector<vector<int>> merge(vector<vector<int>>& intervals) {
        int n = intervals.size();

         sort(intervals.begin(), intervals.end());

        vector<vector<int>> ans;

        int prevstart = intervals[0][0];
        int prevend = intervals[0][1];

        for(int i = 1; i < n; i++){

            int start = intervals[i][0];
            int end = intervals[i][1];

            if(prevend < start ){
               ans.push_back({prevstart, prevend});
                prevstart = start;
                prevend = end;
            }else{
               prevend = max(prevend, end);
            }
        }

         ans.push_back({prevstart, prevend});
         return ans;
         
    }
public:
    vector<vector<int>> insert(vector<vector<int>>& intervals, vector<int>& newInterval) {
        intervals.push_back({newInterval[0],newInterval[1]});
        return merge(intervals);
    }
};