package br.zg.util;

import br.zg.Card;
import br.zg.enums.SuitEnum;
import br.zg.enums.KindEnum;

import java.util.ArrayList;
import java.util.List;

public class CardUtil {

    public static List<Card> convertHandToCardList(String hand){
        List<Card> cards = new ArrayList<>();
        for(String s:hand.split(" ")){
            Card card = stringToCard(s);
            cards.add(card);
        }
        return cards;
    }

    private static Card stringToCard(String s){
        return new Card(KindEnum.lookup(s.charAt(0)), SuitEnum.lookup(s.charAt(1)));
    }
}
