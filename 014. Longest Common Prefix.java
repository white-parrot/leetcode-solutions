class Solution {
    public String longestCommonPrefix(String[] strs) {
        String outcome = strs[0];
        for(String s : strs){
            int k = 0;
            while(k < outcome.length()){
                if(k == s.length()){
                    outcome = s; break;
                }
                if(outcome.charAt(k) == s.charAt(k)){
                    k++;
                    continue;
                }else{
                    outcome = (k == 0 ? "" : outcome.substring(0, k));
                    break;
                }
            }
        }
        return outcome;
    }
}
