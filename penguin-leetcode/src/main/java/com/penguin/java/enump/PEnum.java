package com.penguin.java.enump;

public enum PEnum {
    PENum_01(1,"str01"),PENum_02(2,"str02"),PENum_03(3,"str03");
    int i;
    String s;
    PEnum() {
    }

    PEnum(int i, String s) {
        this.i = i;
        this.s = s;
    }
}
