class Solution {
    public int solution(int n, int k) {
        int bill = 12000*n + 2000*k - 2000*(n/10);
        return bill;
    }
}