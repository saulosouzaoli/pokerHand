package br.zg.util;

import br.zg.Card;
import br.zg.enums.CategoryEnum;
import br.zg.enums.SuitEnum;
import br.zg.enums.KindEnum;

import java.util.Collections;
import java.util.List;

public class CategoryUtil {

    public static CategoryEnum generateCategory(List<Card> hand) {
        if (isRoyalFlush(hand))
            return CategoryEnum.ROYAL_FLUSH;

        if (isStraightFlush(hand))
            return CategoryEnum.STRAIGHT_FLUSH;

        if (isFourOfAKind(hand))
            return CategoryEnum.FOUR_OF_A_KIND;

        if (isFullHouse(hand))
            return CategoryEnum.FULL_HOUSE;

        if (isFlush(hand))
            return CategoryEnum.FLUSH;

        if (isStraight(hand))
            return CategoryEnum.STRAIGHT;

        if (isThreeOfAKind(hand))
            return CategoryEnum.THREE_OF_A_KIND;

        if (isTwoPair(hand))
            return CategoryEnum.TWO_PAIR;

        if (isOnePair(hand))
            return CategoryEnum.ONE_PAIR;

        return CategoryEnum.HIGH_CARD;
    }


    private static boolean isRoyalFlush(List<Card> hand) {
        return hand.contains(new Card(KindEnum._A))
                && hand.contains(new Card(KindEnum._K))
                && hand.contains(new Card(KindEnum._Q))
                && hand.contains(new Card(KindEnum._J))
                && hand.contains(new Card(KindEnum._T))
                && hasSameSuit(hand);

    }

    private static boolean isStraightFlush(List<Card> hand) {

        return hasSequence(hand) && hasSameSuit(hand);

    }

    private static boolean isFourOfAKind(List<Card> hand) {
        return hasSameKind(hand, 4);
    }

    private static boolean isFullHouse(List<Card> hand) {
        return  hasTwoGroups(hand, 3, 2);
    }

    private static boolean isFlush(List<Card> hand) {


        return hasSameSuit(hand);
    }

    private static boolean isStraight(List<Card> hand) {

        return hasSequence(hand);
    }

    private static boolean isTwoPair(List<Card> hand) {

        return hasTwoGroups(hand,2,2);
    }

    private static boolean isThreeOfAKind(List<Card> hand) {
        return hasSameKind(hand, 3);
    }

    private static boolean isOnePair(List<Card> hand) {
        return hasSameKind(hand, 2);
    }


    private static boolean hasSequence(List<Card> hand) {
        Collections.sort(hand);
        for (int i = 1; i < 5; i++) {
            if (!hand.get(i).getKind().getValue().equals(hand.get(i - 1).getKind().getValue() - 1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean hasSameKind(List<Card> hand, int nTimes) {
        Collections.sort(hand);
        KindEnum kind = null;
        Integer count = 1;
        Integer hightestCount=0;
        for (Card card : hand) {
            count++;
            if (kind == null || !kind.getValue().equals(card.getKind().getValue())) {
                kind = card.getKind();
                count = 1;
            }
            if(hightestCount<count){
                hightestCount = count;
            }
        }

        return hightestCount.equals(nTimes);
    }

    private static boolean hasSameSuit(List<Card> hand) {
        SuitEnum suit = null;
        for (Card card : hand) {
            if (suit == null) {
                suit = card.getSuit();
            }
            if (!suit.getValue().equals(card.getSuit().getValue())) {
                return false;
            }
        }

        return true;
    }

    private static boolean hasTwoGroups(List<Card> hand,Integer repetitionAmountFirstGroup,Integer repetitionAmountSecondGroup){
        Collections.sort(hand);
        KindEnum kind = null;
        Integer count = 1;
        Integer firstCount=0;
        Integer secondCount=0;
        for (Card card : hand) {
            count++;
            if (kind == null || !kind.getValue().equals(card.getKind().getValue())) {
                kind = card.getKind();
                count = 1;
                if(secondCount<firstCount) {
                    secondCount = firstCount;
                }
                firstCount=0;
            }
            if(firstCount<count){
                firstCount = count;
            }



        }

        return (firstCount.equals(repetitionAmountFirstGroup) && secondCount.equals(repetitionAmountSecondGroup))||
                (secondCount.equals(repetitionAmountFirstGroup) && firstCount.equals(repetitionAmountSecondGroup));
    }
}
