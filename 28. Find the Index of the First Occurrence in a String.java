class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle.length() > haystack.length()){
            return -1;
        }
        if(needle.equals(haystack)){
            return 0;
        }

        int n = 0, h = 0;
        while(n < needle.length() && h < haystack.length()){
            if(needle.charAt(n) == haystack.charAt(h)){
                n++; h++;
            }else{
                h = h - n + 1;
                n = 0;
            }
        }
        return  n != needle.length() ? -1 : h - n;
    }
}
