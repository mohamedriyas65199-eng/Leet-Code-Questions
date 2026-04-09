class Solution {
    public int findJudge(int n, int[][] trust) {
       
        int[] trustCount = new int[n + 1];
        
       
        for (int[] relationship : trust) {
            int truster = relationship[0];
            int trusted = relationship[1];
            
            
            trustCount[truster]--;
            
           
            trustCount[trusted]++;
        }
        
       
        for (int i = 1; i <= n; i++) {
            if (trustCount[i] == n - 1) {
                return i;
            }
        }
        
       
        return -1;
  
    }
}