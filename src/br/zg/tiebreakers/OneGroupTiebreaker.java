package br.zg.tiebreakers;

import br.zg.Card;
import br.zg.PokerHand;
import br.zg.TiebreakerAuxObject;
import br.zg.enums.KindEnum;
import br.zg.enums.ResultEnum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OneGroupTiebreaker extends Tiebreaker {
    @Override
    public ResultEnum doTiebreaker(PokerHand pokerHand, PokerHand anotherPokerHand) {

        TiebreakerAuxObject tiebreakerHand = extractHigherValuesOfHand(pokerHand.getCards());
        TiebreakerAuxObject anotherTiebreakerHand = extractHigherValuesOfHand(anotherPokerHand.getCards());

        if(tiebreakerHand.getFirstkind().getValue()>anotherTiebreakerHand.getFirstkind().getValue()){
            return ResultEnum.WIN;
        }
        if(tiebreakerHand.getFirstkind().getValue()<anotherTiebreakerHand.getFirstkind().getValue()){
            return ResultEnum.LOSS;
        }

        List<Card> remainderList = removeKindFromHand(pokerHand.getCards(),tiebreakerHand.getFirstkind());

        List<Card> anotherRemainderList = removeKindFromHand(anotherPokerHand.getCards(),anotherTiebreakerHand.getFirstkind());


        return doSequencialTiebreak(remainderList,anotherRemainderList,remainderList.size());
    }
}
