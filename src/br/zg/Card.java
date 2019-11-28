package br.zg;

import br.zg.enums.SuitEnum;
import br.zg.enums.KindEnum;
import br.zg.tiebreakers.Tiebreaker;

public class Card implements  Comparable<Card>  {

    private KindEnum kind;
    private SuitEnum suit;
    public Card(KindEnum kind, SuitEnum suit){
        this.kind = kind;
        this.suit = suit;
    }

    public Card(KindEnum value){
        this.kind = value;
    }
    public String getKey(){
        return kind.getValue()+suit.getValue();
    }
    public KindEnum getKind(){
        return kind;
    }

    public SuitEnum getSuit() {
        return suit;
    }


    @Override
    public int compareTo(Card o1) {
        return  o1.getKind().getValue()- getKind().getValue() ;
    }

    //Foi sobreescrito para utilizar o contains da interface List
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return getKind().getValue().equals(card.getKind().getValue());
    }

}
