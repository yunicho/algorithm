    class Solution {
        public String solution(String s) {
            String answer = "";

            String[] arrStr = s.toLowerCase().split(" ");
            
            for (int i = 0; i < arrStr.length; i++) {
                
                if (arrStr[i].length() == 0) answer += " ";
                else {
                    answer += arrStr[i].substring(0, 1).toUpperCase();
                    answer += arrStr[i].substring(1, arrStr[i].length()).toLowerCase();
                    answer += " ";
                }
            }

            if (s.substring(s.length() - 1, s.length()).equals(" "))
                return answer;
            
            return answer.substring(0, answer.length() -1);
        }
    }