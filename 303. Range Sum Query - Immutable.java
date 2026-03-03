class NumArray {

    ArrayList<Integer> pSumArr = new ArrayList<>();

    public NumArray(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
            pSumArr.add(sum);
        }    
    }
    
    public int sumRange(int left, int right) {
        if(left == 0){
            return pSumArr.get(right);
        }else{
            return pSumArr.get(right) - pSumArr.get(left - 1);
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
