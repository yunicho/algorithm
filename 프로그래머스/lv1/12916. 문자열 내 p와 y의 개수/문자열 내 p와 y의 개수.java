class Solution {
    boolean solution(String s) {
        boolean answer = true;
                int countP = 0;
                int countY = 0;

                String str = s.toLowerCase();
                String[] arrStr = str.split("");

                for (int i = 0; i < arrStr.length; i++) {
                    if (String.valueOf(str.charAt(i)).equals("p")) {
                        countP += 1;
                    } else if (String.valueOf(str.charAt(i)).equals("y")) {
                        countY += 1;
                    }
                }

                if (countP == countY) {
                    answer = true;
                } else {
                    answer = false;
                }

                return answer;
        }
}