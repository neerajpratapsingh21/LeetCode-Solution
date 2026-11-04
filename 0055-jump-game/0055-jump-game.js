/**
 * @param {number[]} nums
 * @return {boolean}
 */
var canJump = function(nums) {
    let n = nums.length;
    let maxind = 0;
    for(let i = 0; i<n; i++){
        if(maxind < i) return false;
        if(maxind >= n) return true;

        if(maxind < i+nums[i]){
            maxind = i+nums[i];
        }
    }
    return true;
};