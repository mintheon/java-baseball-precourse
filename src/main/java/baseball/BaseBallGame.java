package baseball;

import baseball.domain.Balls;
import baseball.domain.Computer;
import baseball.domain.Gamer;
import baseball.domain.Result;
import baseball.view.Input;

import java.util.List;

public class BaseBallGame {
    static final int MIN_NUMBER = 1;
    static final int MAX_NUMBER = 9;

    public void start() {
        boolean isContinue = false;

        do {
            play();

            isContinue = Input.isContinue();
        } while (isContinue);
    }

    private void play() {
        Balls answers = new Balls(new Computer().generateRandomNumber());

        Result result;
        do {
            List<Integer> userBalls = inputNumber();

            result = answers.check(userBalls);
            result.print();
        } while (result.countStrike() != 3);

        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 끝");
    }

    private List<Integer> inputNumber() {
        while (true) {
            String inputNumbers = Input.number();

            Gamer gamer = new Gamer();
            if (gamer.validate(inputNumbers)) {
                return gamer.numbers(inputNumbers);
            }
        }
    }
}
