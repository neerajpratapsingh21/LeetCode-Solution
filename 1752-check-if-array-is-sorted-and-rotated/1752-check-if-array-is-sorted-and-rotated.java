class Solution {
    public boolean check(int[] arr) {
    int n= arr.length;
    if(n<2) return true;
    int  x= 0;
    for(int i=1;i<n;i++){
        if(arr[i-1]> arr[i]){
            x=n-i;
            break;
        }
    }
      if(x==0) return true;
      int temp[]=new int[n];
      for(int i=0;i<n;i++){
        temp[(i+x) % n ] = arr[i];
      }
       for(int i=1;i<n;i++){
        if(temp[i-1]> temp[i]) return false;
    }
    return true;
    }
}