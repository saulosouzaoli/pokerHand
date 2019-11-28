package br.zg.util;

import br.zg.PokerHand;
import br.zg.enums.CategoryEnum;
import br.zg.enums.ResultEnum;
import br.zg.tiebreakers.Tiebreaker;

import java.util.Collections;

public class PokerHandUtil {

    public static ResultEnum  compareWith(PokerHand pokerHand,PokerHand anotherPokerHand){
        print(pokerHand,anotherPokerHand);
        CategoryEnum pokerHandCategory = pokerHand.getCategory();

        if(pokerHandCategory.getValue().equals(anotherPokerHand.getCategory().getValue())){

            return pokerHandCategory.getTiebreaker().doTiebreaker(pokerHand,anotherPokerHand);
        }

        if(pokerHandCategory.getValue()>(anotherPokerHand.getCategory().getValue())){
            return ResultEnum.WIN;
        }

        return ResultEnum.LOSS;
    }




    private static void  print(PokerHand pokerHand,PokerHand anotherPokerHand){
        System.out.println("anotherPokerHand: "+pokerHand.getCategory().name());
        System.out.println("otherPokerHand: "+anotherPokerHand.getCategory().name());

    }
}
