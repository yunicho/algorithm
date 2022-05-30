//Throw three dices
//3 same numbers, 10,000+(number)×1,000
//2 same numbers, 1,000+(number)×100
//No same number, (max result) x 100


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        in.close();

        int prize = 0;

        if (a == b && b == c && a == c) {
            prize = 10000 + a * 1000;
        }
        else if (a == b || a == c) {
            prize = 1000 + a * 100;
        }
        else if (b == c) {
            prize = 1000 + b * 100;
        }
        else {
            prize = Math.max(a,  Math.max(b, c)) * 100;
        }
       System.out.println(prize);
        }
}
