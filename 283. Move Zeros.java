class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0, r = 1, n = nums.length - 1, t = -1;
        while(r <= n){
            if(nums[l] != 0){
                l++; r++;
            }else if(nums[r] == 0){
                r++;
            }else{
                t = nums[l];
                nums[l] = nums[r];
                nums[r] = t;
                l++;r++;
            }
        }
    }
}
