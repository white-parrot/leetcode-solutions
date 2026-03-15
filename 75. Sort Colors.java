class Solution {
    public void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private void quickSort(int[] nums, int l, int r){

        if(l > r) return;
                
        int p = nums[l], i = l+1, j = r, t = -1;

        while(i <= j){
            if(nums[i] <= p){
                i++;
            }else if(nums[j] > p){
                j--;
            }else{
                t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;j--;
            }
        }
        //System.out.println(Arrays.toString(nums));
        t = nums[j];
        nums[j] = p;
        nums[l] = t;
        quickSort(nums, l, j-1);
        quickSort(nums, j+1, r);
    }
}
