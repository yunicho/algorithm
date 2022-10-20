class Solution {
    public String solution(String my_string) {
        char [] reverse = my_string.toCharArray();
        for (int i = 0; i < reverse.length; i ++) {
            reverse[i] = Character.isUpperCase(reverse[i])
                ? Character.toLowerCase(reverse[i])
                : Character.toUpperCase(reverse[i]);
        }
        
        return new String(reverse);
    }
}