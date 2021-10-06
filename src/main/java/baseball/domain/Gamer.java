package baseball.domain;

import baseball.enums.Error;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Gamer {
    public boolean validate(String inputNumbers) {
        try {
            validateNumber(inputNumbers);
            validateDuplicate(inputNumbers);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Integer> numbers(String inputNumberTexts) {
        return parseNumbers(inputNumberTexts);
    }

    private List<Integer> parseNumbers(String inputTexts) {
        return Arrays.asList(inputTexts.split(""))
                .stream()
                .map(number -> Integer.parseInt(number))
                .collect(Collectors.toList());
    }

    private void validateNumber(String inputNumbers) {
        if (!Pattern.matches("[1-9]{3}", inputNumbers)) {
            throw new IllegalArgumentException(Error.WRONG_INPUT.message());
        }
    }

    private void validateDuplicate(String inputNumbers) {
        if (isDuplicate(inputNumbers)) {
            throw new IllegalArgumentException(Error.WRONG_INPUT.message());
        }
    }

    private boolean isDuplicate(String inputNumbers) {
        Set<String> numbers = new HashSet<>(Arrays.asList(inputNumbers.split("")));

        return inputNumbers.length() != numbers.size();
    }
}
