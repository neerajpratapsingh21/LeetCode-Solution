class Solution {
    public void reverse(char[] arr, int left,int right){
         while(left<=right) {
                char temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                right--;
                left++;
            }
    }
    public String reverseWords(String s) {
        char arr[] = s.toCharArray();
        int left = 0;
        int right = 0;
        while(right < arr.length){
            while(right < arr.length && arr[right] != ' ') right++;
            reverse(arr,left,right-1);
            right++;
            left = right;
        }
        return new String(arr);
    }
}