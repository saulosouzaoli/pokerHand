package br.zg;

import br.zg.enums.CategoryEnum;
import br.zg.enums.ResultEnum;
import br.zg.tiebreakers.Tiebreaker;
import br.zg.util.CardUtil;
import br.zg.util.CategoryUtil;

import java.util.List;

public class PokerHand {

    private List<Card> cards;
    private CategoryEnum category;


    public PokerHand(String hand){
        this.cards = CardUtil.convertHandToCardList(hand);
        this.category = CategoryUtil.generateCategory(this.cards);
    }


    public List<Card> getCards() {
        return cards;
    }

    public CategoryEnum getCategory() {
        return category;
    }



}
