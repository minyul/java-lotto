package lotto.view;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class InputView {
    private static final String INPUT_AMOUNT_MESSAGE = "구입금액을 입력해 주세요.";
    private static final String INPUT_WINNER_LOTTO_NUMBERS_MESSAGE = "지난 주 당첨 번호를 입력해 주세요.";
    private static final String NUMBER_REGEX = "[^0-9,]";
    private static final Scanner scanner = new Scanner(System.in);

    public int inputAmount() {
        System.out.println(INPUT_AMOUNT_MESSAGE);
        return Integer.parseInt(scanner.nextLine());
    }

    public Set<Integer> inputWinnerLottoNumbers() {
        System.out.println(String.format("%n%s", INPUT_WINNER_LOTTO_NUMBERS_MESSAGE));
        String winnerLottoNumberString = scanner.nextLine().replaceAll(NUMBER_REGEX, "");
        String[] winnerLottoNumbers = winnerLottoNumberString.split(",");
        return Arrays.stream(winnerLottoNumbers)
                .map(lottoNumber -> Integer.valueOf(lottoNumber))
                .collect(Collectors.toSet());
    }
}
