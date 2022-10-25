class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        String answer = "";
        
        int[] numList = new int[str.length];
        
        for (int i = 0; i < numList.length; i++) {
            numList[i] = Integer.parseInt(str[i]);
        } 
        
        int maxNum = numList[0];
        int minNum = numList[0];
        
        for (int j = 0; j < numList.length; j++) {
            maxNum = Math.max(maxNum, numList[j]);
            minNum = Math.min(minNum, numList[j]);
        }
        
        return answer = minNum + " " + maxNum;
    }
}