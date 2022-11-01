class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sumX = 0;
        int a = x;
        
        while (x > 0) {
            sumX += x % 10;
            x /= 10;
        }
        
        if (a % sumX != 0) {
            answer = false;
        }
        
        return answer;
    }
}