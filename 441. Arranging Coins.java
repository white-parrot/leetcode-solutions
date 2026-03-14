class Solution {
    public int arrangeCoins(int n) {

        if(n == 0) return 0;

        int l = 0, r = n, m = -1;
        long k = 0L;
        while(l <= r){
            m = (l + r) / 2;
            k = ((long)m * (m + 1)) / 2;
            if(k == n) return m;
            else if(k < n){
                l = m + 1;
            }else{
                r = m - 1;
            }
        }
        return r;
    }
}
