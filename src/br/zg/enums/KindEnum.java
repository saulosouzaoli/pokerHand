package br.zg.enums;

public enum KindEnum {

    _1(1),_2(2),_3(3),_4(4),_5(5),_6(6),_7(7),_8(8),_9(9),_T(10),_J(11),_Q(12),_K(13),_A(14);

    KindEnum(Integer value) {
        this.value = value;
    }

    private Integer value;

    public Integer getValue() {
        return value;
    }


    public static KindEnum lookup(char value){
        return lookup(String.valueOf(value));
    }

    public static KindEnum lookup(String value){
        for(KindEnum s :values()){
            if(s.name().contains(value)){
                return s;
            }
        }

        return null;
    }

}
