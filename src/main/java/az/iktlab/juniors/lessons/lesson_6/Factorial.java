package az.iktlab.juniors.lessons.lesson_6;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(calcFac(num));
        System.out.println(calcRec(num));
    }

    public static int calcFac(int digit) {
        int res = 1;
        for (int i = 1; i <= digit; i++) {
            res *= i;

        }
        return res;
    }



    public static int calcRec(int digit) {
        return digit == 1 ? 1 : digit * calcRec(digit - 1);
    }
}
