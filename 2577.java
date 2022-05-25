// For three integers A, B, C, write a program that counts the number of each digit of A x B x C
//input 150, 266, 427 ==> output 3,1,0,2,0,0,0,2,0

예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int value = (in.nextInt() * in.nextInt() * in.nextInt());
        String str = Integer.toString(value);
        in.close();

        for (int i = 0; i < 10; i ++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if ((str.charAt(j) - '0') == i) {count++;}
            }
            System.out.println(count);
        }

    }
}
