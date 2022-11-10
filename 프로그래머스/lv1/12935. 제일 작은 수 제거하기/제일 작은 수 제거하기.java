class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length == 1) {
            int[] answer = {-1};
            
            return answer;
        }
        
        int[] answer = new int[arr.length - 1];
        
        int min = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        
        int newArr = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == min) {
                continue;
            }
            
            answer[newArr++] = arr[i];
        }
        
        return answer;
    }
}