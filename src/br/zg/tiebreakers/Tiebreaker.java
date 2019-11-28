package br.zg.tiebreakers;

import br.zg.Card;
import br.zg.PokerHand;
import br.zg.TiebreakerAuxObject;
import br.zg.enums.KindEnum;
import br.zg.enums.ResultEnum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class Tiebreaker {

   public abstract ResultEnum doTiebreaker(PokerHand pokerHand, PokerHand anotherPokerHand);

    protected final ResultEnum doSequencialTiebreak(List<Card> pokerHand, List<Card> anotherPokerHand, Integer listSize){
       Collections.sort(pokerHand);
       Collections.sort(anotherPokerHand);

       for(int i=0;i<listSize;i++){
           if(pokerHand.get(i).getKind().getValue()>anotherPokerHand.get(i).getKind().getValue())
               return  ResultEnum.WIN;
           if(pokerHand.get(i).getKind().getValue()<anotherPokerHand.get(i).getKind().getValue())
               return  ResultEnum.LOSS;
       }
       return ResultEnum.DRAW;
   }

    protected final  TiebreakerAuxObject extractHigherValuesOfHand(List<Card> hand) {
        Collections.sort(hand);
        KindEnum kind = null;
        Integer count = 1;

        TiebreakerAuxObject tao = new TiebreakerAuxObject();

        for (Card card : hand) {
            count++;
            if (kind == null || !kind.getValue().equals(card.getKind().getValue())) {
                kind = card.getKind();
                count = 1;
                if (tao.getSecondCount() < tao.getFirstCount()) {
                    tao.setSecondCount(tao.getFirstCount());
                    tao.setSecondkind(tao.getFirstkind());
                }
                tao.setFirstCount(0);
            }
            if (tao.getFirstCount() < count) {
                tao.setFirstCount(count);
                tao.setFirstkind(kind);
            }


        }
        if(tao.getSecondCount()>tao.getFirstCount()){
            count = tao.getFirstCount();
            kind = tao.getFirstkind();

            tao.setFirstCount(tao.getSecondCount());
            tao.setFirstkind(tao.getSecondkind());

            tao.setSecondCount(count);
            tao.setSecondkind(kind);
        }
        return tao;
    }
    protected final  List<Card> removeKindFromHand(List<Card> hand,KindEnum kind) {

        List<Card> remainderList = new ArrayList<>();
        remainderList.addAll(hand);


        Iterator<Card> it = remainderList.iterator();
        while (it.hasNext()) {

            Card card = it.next();
            if(card.getKind().getValue().equals(kind.getValue())){
                it.remove();
            }

        }
        return remainderList;
    }
}
