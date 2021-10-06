package baseball.domain;

import baseball.enums.Score;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Balls {
    private final List<Ball> balls;

    public Balls(List<Integer> numbers) {
        this.balls = makeBalls(numbers);
    }

    private List<Ball> makeBalls(List<Integer> numbers) {
        AtomicInteger index = new AtomicInteger(1);

        return numbers.stream()
                .map(number -> new Ball(index.getAndIncrement(), number))
                .collect(Collectors.toList());
    }

    public Score check(Ball target) {
        return balls.stream()
                .map(ball -> ball.check(target))
                .filter(score -> score.isNotNothing())
                .findFirst()
                .orElse(Score.NOTHING);
    }
}
