package br.zg.enums;

public enum SuitEnum {
    HEARTH("H"),DIAMOND("D"),CLUB("C"),SPADES("S");
    private String value;

    SuitEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


    public static SuitEnum lookup(char value){
        return lookup( String.valueOf(value));
    }
    public static SuitEnum lookup(String value){
       for(SuitEnum s :values()){
           if(s.getValue().equals(value)){
               return s;
           }
       }

        return null;
    }
}
