class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length - 1;
        if(n == 0 || nums[0] != nums[1]) return nums[0];
        if(nums[n] != nums[n - 1]) return nums[n];
        
        int l = 0, r = n, mid = -1;
        while(l < r ){
            mid = (l + r) / 2;

            if(mid % 2 != 0) mid--;

            if(nums[mid] == nums[mid + 1]){
                l = mid + 2;
            }else if(nums[mid] != nums[mid + 1]){
                r = mid;
            }
        }
        return nums[l];
    }
}
