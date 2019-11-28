package br.zg.tiebreakers;

import br.zg.PokerHand;
import br.zg.enums.ResultEnum;


public class SequencialTiebreaker extends Tiebreaker {


    @Override
    public ResultEnum doTiebreaker(PokerHand pokerHand, PokerHand anotherPokerHand) {

        return doSequencialTiebreak(pokerHand.getCards(),anotherPokerHand.getCards(),5);
    }
}
