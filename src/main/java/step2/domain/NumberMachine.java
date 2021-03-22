package step2.domain;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberMachine {

    public static List<Integer> number(int upperbound, int count) {
        if (count > upperbound) throw new IllegalArgumentException();

        return IntStream.rangeClosed(1, upperbound)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toList(), NumberMachine::shuffleList))
                .subList(0, count)
                .stream()
                .sorted()
                .collect(Collectors.toList());
    }

    private static List<Integer> shuffleList(List<Integer> list) {
        Collections.shuffle(list);
        return list;
    }

}
