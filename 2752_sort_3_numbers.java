// Input three numbers and sort them in incremental order

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[3];
        for (int i = 0; i < 3; i++) num[i] = in.nextInt();

        Arrays.sort(num);
        for (int i : num)
            System.out.print(i + " ");
        }
}
