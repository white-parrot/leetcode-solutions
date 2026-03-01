class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashMap<Integer, Boolean> track = new HashMap<>();
        for(int num : nums){
            track.put(num, true);
        }

        for(int num :  nums){
            if(track.containsKey(num - 1)){
                track.put(num, false);
            }
        }

        int max_len = 0;
        for(int num : track.keySet()){
            
            if(track.get(num)){
                int x = num, count = 1;
                while(track.containsKey(x + 1)){
                    x++;
                    count++;
                }
                max_len = Math.max(max_len, count);
            }
        }
        return max_len;
    }
}
