package baseball.domain;

import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Computer {
    static final int MIN_NUMBER = 1;
    static final int MAX_NUMBER = 9;
    static final int SIZE = 3;

    public List<Integer> generateRandomNumber() {
        Set<Integer> numbers = new LinkedHashSet<>();

        while (numbers.size() != SIZE) {
            numbers.add(Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER));
        }

        return new ArrayList<>(numbers);
    }
}
