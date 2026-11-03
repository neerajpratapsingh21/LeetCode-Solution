class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n  =  bills.length;
        int coin[] = new int[2];
        for(int i=0; i<n; i++){
            if(bills[i] == 5){
                coin[0]++;
            }else if(bills[i] == 10){
                if(coin[0] == 0) return false;
                coin[0]--;
                coin[1]++;
            }else{
                if(coin[0] == 0) return false;
                if(coin[1] != 0){
                coin[0]--;
                coin[1]--;
                }else{
                    if(coin[0] <3) return false;
                    coin[0]-=3;
                }
            }
        }
        return true;
    }
}