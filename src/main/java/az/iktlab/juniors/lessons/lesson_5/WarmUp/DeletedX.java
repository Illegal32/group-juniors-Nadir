package az.iktlab.juniors.lessons.lesson_5.WarmUp;

import java.util.Locale;
import java.util.Scanner;

public class DeletedX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String res = sc.next();
        res = res.toLowerCase();
        if (res.contains("x")) {
            System.out.println(res.replace("x", ""));
        }
    }
}
