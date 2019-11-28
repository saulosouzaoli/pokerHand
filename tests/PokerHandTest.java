import br.zg.PokerHand;
import br.zg.enums.ResultEnum;
import br.zg.util.PokerHandUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PokerHandTest {

    @Test
    public void doTest01() {
        PokerHand pokerHand = new PokerHand("9C TC JC QC KC");
        PokerHand anotherHand = new PokerHand("9C 9H 5C 5H AC");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest02() {
        PokerHand pokerHand = new PokerHand("TC TH 5C 5H KH");
        PokerHand anotherHand = new PokerHand("9C 9H 5C 5H AC");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest03() {
        PokerHand pokerHand = new PokerHand("TS TD KC JC 7C");
        PokerHand anotherHand = new PokerHand("JS JC AS KC TD");
        assertEquals(ResultEnum.LOSS,PokerHandUtil.compareWith(pokerHand,anotherHand));
    }

    @Test
    public void doTest04() {
        PokerHand pokerHand = new PokerHand("7H 7C QC JS TS");
        PokerHand anotherHand = new PokerHand("7D 7C JS TS 6D");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest05() {
        PokerHand pokerHand = new PokerHand("5S 5D 8C 7S 6H");
        PokerHand anotherHand = new PokerHand("7D 7S 5S 5D JS");
        assertEquals(ResultEnum.LOSS,PokerHandUtil.compareWith(pokerHand,anotherHand));
    }

    @Test
    public void doTest06() {
        PokerHand pokerHand = new PokerHand("AS AD KD 7C 3D");
        PokerHand anotherHand = new PokerHand("AD AH KD 7C 4S");
        assertEquals(ResultEnum.LOSS,PokerHandUtil.compareWith(pokerHand,anotherHand));
    }

    @Test
    public void doTest07() {
        PokerHand pokerHand = new PokerHand("TS JS QS KS AS");
        PokerHand anotherHand = new PokerHand("AC AH AS AS KS");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest08() {
        PokerHand pokerHand = new PokerHand("TS JS QS KS AS");
        PokerHand anotherHand = new PokerHand("TC JS QC KS AC");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest09() {
        PokerHand pokerHand = new PokerHand("TS JS QS KS AS");
        PokerHand anotherHand = new PokerHand("QH QS QC AS 8H");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest10() {
        PokerHand pokerHand = new PokerHand("AC AH AS AS KS");
        PokerHand anotherHand = new PokerHand("TC JS QC KS AC");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest11() {
        PokerHand pokerHand = new PokerHand("AC AH AS AS KS");
        PokerHand anotherHand = new PokerHand("QH QS QC AS 8H");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest12() {
        PokerHand pokerHand = new PokerHand("TC JS QC KS AC");
        PokerHand anotherHand = new PokerHand("QH QS QC AS 8H");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest13() {
        PokerHand pokerHand = new PokerHand("7H 8H 9H TH JH");
        PokerHand anotherHand = new PokerHand("JH JC JS JD TH");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest14() {
        PokerHand pokerHand = new PokerHand("7H 8H 9H TH JH");
        PokerHand anotherHand = new PokerHand("4H 5H 9H TH JH");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest15() {
        PokerHand pokerHand = new PokerHand("7H 8H 9H TH JH");
        PokerHand anotherHand = new PokerHand("7C 8S 9H TH JH");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest16() {
        PokerHand pokerHand = new PokerHand("7H 8H 9H TH JH");
        PokerHand anotherHand = new PokerHand("TS TH TD JH JD");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest17() {
        PokerHand pokerHand = new PokerHand("7H 8H 9H TH JH");
        PokerHand anotherHand = new PokerHand("JH JD TH TC 4C");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest18() {
        PokerHand pokerHand = new PokerHand("JH JC JS JD TH");
        PokerHand anotherHand = new PokerHand("4H 5H 9H TH JH");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest19() {
        PokerHand pokerHand = new PokerHand("JH JC JS JD TH");
        PokerHand anotherHand = new PokerHand("7C 8S 9H TH JH");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest20() {
        PokerHand pokerHand = new PokerHand("JH JC JS JD TH");
        PokerHand anotherHand = new PokerHand("TS TH TD JH JD");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest21() {
        PokerHand pokerHand = new PokerHand("JH JC JS JD TH");
        PokerHand anotherHand = new PokerHand("JH JD TH TC 4C");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest22() {
        PokerHand pokerHand = new PokerHand("4H 5H 9H TH JH");
        PokerHand anotherHand = new PokerHand("7C 8S 9H TH JH");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest23() {
        PokerHand pokerHand = new PokerHand("4H 5H 9H TH JH");
        PokerHand anotherHand = new PokerHand("TS TH TD JH JD");
        assertEquals(ResultEnum.LOSS,PokerHandUtil.compareWith(pokerHand,anotherHand));
    }

    @Test
    public void doTest24() {
        PokerHand pokerHand = new PokerHand("4H 5H 9H TH JH");
        PokerHand anotherHand = new PokerHand("JH JD TH TC 4C");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest25() {
        PokerHand pokerHand = new PokerHand("7C 8S 9H TH JH");
        PokerHand anotherHand = new PokerHand("TS TH TD JH JD");
        assertEquals(ResultEnum.LOSS,PokerHandUtil.compareWith(pokerHand,anotherHand));
    }

    @Test
    public void doTest26() {
        PokerHand pokerHand = new PokerHand("7C 8S 9H TH JH");
        PokerHand anotherHand = new PokerHand("JH JD TH TC 4C");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest27() {
        PokerHand pokerHand = new PokerHand("TS TH TD JH JD");
        PokerHand anotherHand = new PokerHand("JH JD TH TC 4C");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest28() {
        PokerHand pokerHand = new PokerHand("2S 3H 4D 5H 6D");
        PokerHand anotherHand = new PokerHand("5H 6D 7H 8C 9C");
        assertEquals(ResultEnum.LOSS,PokerHandUtil.compareWith(pokerHand,anotherHand));
    }

    @Test
    public void doTest29() {
        PokerHand pokerHand = new PokerHand("2S 3H 4H 5H 6D");
        PokerHand anotherHand = new PokerHand("2S 3H 4D 5H 6C");
        assertEquals(ResultEnum.DRAW,PokerHandUtil.compareWith(pokerHand,anotherHand));
    }

    @Test
    public void doTest30() {
        PokerHand pokerHand = new PokerHand("2H 3H 4H 5H 7H");
        PokerHand anotherHand = new PokerHand("2D 3D 4D 5D 8D");
        assertEquals(ResultEnum.LOSS,PokerHandUtil.compareWith(pokerHand,anotherHand));
    }

    @Test
    public void doTest31() {
        PokerHand pokerHand = new PokerHand("2S 2H 2D 5H 6D");
        PokerHand anotherHand = new PokerHand("5H 5D 5H 8C 9C");
        assertEquals(ResultEnum.LOSS,PokerHandUtil.compareWith(pokerHand,anotherHand));
    }

    @Test
    public void doTest32() {
        PokerHand pokerHand = new PokerHand("2H 3H 4H 5H 6H");
        PokerHand anotherHand = new PokerHand("5H 6H 7H 8H 9H");
        assertEquals(ResultEnum.LOSS,PokerHandUtil.compareWith(pokerHand,anotherHand));
    }

    @Test
    public void doTest33() {
        PokerHand pokerHand = new PokerHand("TH JH QH KH AH");
        PokerHand anotherHand = new PokerHand("TC JC QC KC AC");
        assertEquals(ResultEnum.DRAW,PokerHandUtil.compareWith(pokerHand,anotherHand));
    }

    @Test
    public void doTest34() {
        PokerHand pokerHand = new PokerHand("TH TH TH TH AS");
        PokerHand anotherHand = new PokerHand("9C 9C 9C 9C 2S");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest35() {
        PokerHand pokerHand = new PokerHand("TH TH TH AH AS");
        PokerHand anotherHand = new PokerHand("9C 9C 9C 2C 2S");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest36() {
        PokerHand pokerHand = new PokerHand("2H 4H 6H 8H AS");
        PokerHand anotherHand = new PokerHand("3C 5C 6C 8C JS");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest37() {
        PokerHand pokerHand = new PokerHand("2H 2H 2H AH AS");
        PokerHand anotherHand = new PokerHand("2C 2C 2C JC JS");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }

    @Test
    public void doTest38() {
        PokerHand pokerHand = new PokerHand("2H 2H 5H AH AS");
        PokerHand anotherHand = new PokerHand("2C 2C 6C AC AS");

        assertEquals(ResultEnum.LOSS,PokerHandUtil.compareWith(pokerHand,anotherHand));
    }

    @Test
    public void doTest39() {
        PokerHand pokerHand = new PokerHand("2H 3C 3D 3S 6H");
        PokerHand anotherHand = new PokerHand("2C 3D 4D 5C 6C");
        assertEquals(ResultEnum.LOSS,PokerHandUtil.compareWith(pokerHand,anotherHand));
    }

    @Test
    public void doTest40() {
        PokerHand pokerHand = new PokerHand("AS 2S 5S 8S QS");
        PokerHand anotherHand = new PokerHand("KS JS 5S 8S QS");
        assertEquals(ResultEnum.WIN,PokerHandUtil.compareWith(pokerHand,anotherHand));;
    }
}

