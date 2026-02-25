class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> track = new HashMap<>();

        int i = 0;
        int[] op = new int[2];
        for(int n : nums){
            int c = target - n;
            if(track.get(c) == null){
                track.put(n, i);
            }else{
                op[0] = track.get(c);
                op[1] = i;
            }
            i++;
        }
        return op;
    }
}
