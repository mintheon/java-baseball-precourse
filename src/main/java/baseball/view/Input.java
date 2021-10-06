package baseball.view;

import nextstep.utils.Console;

public class Input {
    public static String number() {
        System.out.print("숫자를 입력해주세요 : ");

        return Console.readLine();
    }

    public static boolean isContinue() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        return "1".equals(Console.readLine());
    }
}
