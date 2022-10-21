class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxVertical = 0;
        int maxHorizontal = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            int vertical = Math.max(sizes[i][0], sizes[i][1]);
            int horizontal = Math.min(sizes[i][0], sizes[i][1]);
            maxVertical = Math.max(vertical, maxVertical);
            maxHorizontal = Math.max(horizontal, maxHorizontal);
        }
        
        return answer = maxVertical * maxHorizontal;
    }
}