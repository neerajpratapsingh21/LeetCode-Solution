class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        long size = (long) n * n; // Use long to prevent multiplication overflow
        long totalsum = size * (size + 1) / 2;
        
        long sum = 0;
        Set<Integer> set = new HashSet<>();
        int repeating = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];
                sum += val;
                
                // If set already has it, we found our repeating number
                if (!set.add(val)) { 
                    repeating = val;
                }
            }
        }
        
        // Cast back to int since the answer elements fit in integer bounds
        int missing = (int) (totalsum - (sum - repeating));
        
        return new int[]{repeating, missing};
    }
}