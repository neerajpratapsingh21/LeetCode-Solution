class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
    int n=grid.length;
     int totalsum=(n*n)*((n*n)+1)/2;
     int sum =0;
    Set<Integer> set = new HashSet<>();
    int repeating=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            sum +=grid[i][j];
            if(set.contains(grid[i][j])){
                repeating=grid[i][j];
            }
            set.add(grid[i][j]);
        }
    }
   
     return new int[]{repeating ,totalsum-(sum-repeating)};
    }
}