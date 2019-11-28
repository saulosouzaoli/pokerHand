package br.zg;

import br.zg.enums.KindEnum;

import java.util.ArrayList;
import java.util.List;

public class TiebreakerAuxObject {

    private  KindEnum firstkind ;
    private  KindEnum secondkind ;
    private Integer firstCount;
    private Integer secondCount;

    public TiebreakerAuxObject(){
       setFirstkind(null);
       setSecondkind(null);
        firstCount= 0;
        secondCount= 0;
    }

    public KindEnum getFirstkind() {
        return firstkind;
    }

    public void setFirstkind(KindEnum firstkind) {
        this.firstkind = firstkind;
    }

    public KindEnum getSecondkind() {
        return secondkind;
    }

    public void setSecondkind(KindEnum secondkind) {
        this.secondkind = secondkind;
    }

    public Integer getFirstCount() {
        return firstCount;
    }

    public void setFirstCount(Integer firstCount) {
        this.firstCount = firstCount;
    }

    public Integer getSecondCount() {
        return secondCount;
    }

    public void setSecondCount(Integer secondCount) {
        this.secondCount = secondCount;
    }
}
