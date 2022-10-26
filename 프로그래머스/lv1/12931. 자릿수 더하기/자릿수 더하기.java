import java.util.*;

public class Solution {
    public int solution(int n) {
        int sumDigits = 0;

        while(n !=0) {
            sumDigits += n % 10;
            n /= 10;
        }
        
        return sumDigits;
    }
}