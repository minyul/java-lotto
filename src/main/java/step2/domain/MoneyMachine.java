package step2.domain;

import step2.dto.MoneyDTO;

public class MoneyMachine {
    public MoneyDTO money(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }
        return new MoneyDTO(amount);
    }
}
