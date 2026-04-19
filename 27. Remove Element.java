class Solution {
    public int removeElement(int[] nums, int val) {

        int c = 0;                              // counts how many times val was found
        for (int i = 0; i < nums.length; i++) {
            nums[i - c] = nums[i];              // shift current element left by c
            if (nums[i] == val) {
                c++;                            // found val → increase the shift gap
            }
        }
        return nums.length - c;                 // remaining valid elements
    }
}
