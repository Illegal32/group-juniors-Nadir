package az.iktlab.juniors.lessons.lesson_5.WarmUp;

import java.util.Scanner;

public class CenterStayX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = sc.next();

        res = res.toLowerCase();

        System.out.println(res.replace("x", " ").trim().replace(" ", "x"));

    }
}
