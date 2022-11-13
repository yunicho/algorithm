class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int total = brown + yellow;
        
        for (int i = 1; i <= total; i++) {
            int row = i;
            int column = total / row;
            
            if (row > column)
                continue;
            
            if ((row - 2) * (column - 2) == yellow) {
                answer[0] = column;
                answer[1] = row;
                
                return answer;
    
            }
        }
        
        return answer;
    }
}