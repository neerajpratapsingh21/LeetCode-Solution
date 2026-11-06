class Solution {
    public int minGroups(int[][] intervals) {
        int n = intervals.length;
        int[] arrivalTime = new int[n];
        int[] depTime = new int[n];
        for (int i = 0; i < n; i++) {
            arrivalTime[i] = intervals[i][0];
            depTime[i] = intervals[i][1];
        }
        Arrays.sort(arrivalTime);
        Arrays.sort(depTime);
        int dep = 0, count = 0;

        for (int arive : arrivalTime) {
            if (arive > depTime[dep]) {
                dep++;
            } else {
               count++;
            }
        }

        return count;
    }
}