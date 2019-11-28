package br.zg.enums;

import br.zg.tiebreakers.OneGroupTiebreaker;
import br.zg.tiebreakers.SequencialTiebreaker;
import br.zg.tiebreakers.Tiebreaker;
import br.zg.tiebreakers.TwoGroupsTiebreaker;

public enum CategoryEnum {

    ROYAL_FLUSH(10,new SequencialTiebreaker()),
    STRAIGHT_FLUSH(9,new SequencialTiebreaker()),
    FOUR_OF_A_KIND(8,new OneGroupTiebreaker()),
    FULL_HOUSE(7,new TwoGroupsTiebreaker()),
    FLUSH(6,new SequencialTiebreaker()),
    STRAIGHT(5,new SequencialTiebreaker()),
    THREE_OF_A_KIND(4,new OneGroupTiebreaker()),
    TWO_PAIR(3,new TwoGroupsTiebreaker()),
    ONE_PAIR(2,new OneGroupTiebreaker()),
    HIGH_CARD(1,new SequencialTiebreaker());

    private Integer value;
    private Tiebreaker tiebreaker;

    CategoryEnum(Integer value,Tiebreaker tiebreaker) {

        this.value = value;
        this.tiebreaker = tiebreaker;
    }

    public Integer getValue() {
        return value;
    }

    public Tiebreaker getTiebreaker() {
        return tiebreaker;
    }
}
