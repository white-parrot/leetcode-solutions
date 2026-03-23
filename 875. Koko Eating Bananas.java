class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int n = piles.length;
        long l = 1l, r = 0;
        for(int i = 0; i < n; i++){
            r = Math.max(r, (long)piles[i]);
        }

        long mid = 0;
        while(l <= r){
            mid = (l + r) / 2;

            if(isItPossible(piles, h, mid)){
                r = mid - 1l;
            }else{
                l = mid + 1l;
            }
        }
        return (int)l;
    }

    private boolean isItPossible(int[] p, int h, long mid){

        int m = (int) mid;
        long hourTaken = 0;
        for(int i = 0; i < p.length; i++){
            if(p[i] <= m){
                hourTaken++;
            }else{
                int t = 0;
                if(p[i] % m == 0) {
                    hourTaken += (p[i] / m);
                }
                else {
                    hourTaken += ((p[i] / m) + 1);
                }
            }
        }
        return hourTaken <= h;
    }
}
