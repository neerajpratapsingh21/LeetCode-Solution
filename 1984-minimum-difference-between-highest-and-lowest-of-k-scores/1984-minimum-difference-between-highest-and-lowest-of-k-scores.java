 class Solution {
      public int minimumDifference(int[] nums, int k) {
          quickSort(nums,0,nums.length-1);
        
           int minDiff = Integer.MAX_VALUE;
           for(int i=0;i<=nums.length-k;i++){
               int diff= nums[i+k-1]-nums[i];
              minDiff=Math.min(minDiff,diff);

           }
               return minDiff;

      }

       public void quickSort(int []arr,int low,int high){
            if(low>=high){
              return;
            }
            int s=low;
            int e=high;
            int pivot=arr[(s+e)/2];
            while(s<=e){

               while(arr[s]< pivot){
                   s++;
               }
                while(arr[e]>pivot){
                   e--;
                }
                   if(s<=e){
                       int temp=arr[s];
                       arr[s]= arr[e];
                       arr[e]=temp;
                       s++;
                       e--;
                   }

             }
                   quickSort(arr,s,high);
                   quickSort(arr,low,e);



    }



}