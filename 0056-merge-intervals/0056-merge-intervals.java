class Solution {
    public int[][] merge(int[][] intervals) {
          int n = intervals.length;
        if (n <= 1) return intervals;
 
        // Sort intervals based on start times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
 
        for (int i = 0; i < n; i++) {
            // If result is empty or current interval does not overlap with the last one
            if (result.isEmpty() || result.get(result.size() - 1)[1] < intervals[i][0]) {
                result.add(intervals[i]);
            } 
            // If there is an overlap, merge by updating the end time of the last interval
            else {
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], intervals[i][1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}