package az.iktlab.juniors.lessons.lesson_4;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder answer = new StringBuilder(sc.next());
        answer.append(answer.charAt(answer.lastIndexOf(String.valueOf(answer))));

        System.out.println(answer);

    }
}
