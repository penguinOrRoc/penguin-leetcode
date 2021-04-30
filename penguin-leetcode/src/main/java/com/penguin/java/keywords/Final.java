package com.penguin.java.keywords;

public class Final {
    public static void main(String[] args){
        final int i = 1;
        //i = 2;
        final String s = "111";
        //s = "222";
        FinalObject fo = new FinalObject();
        final FinalObject fo1 = fo;
        fo.s = "sss";
        fo = null;
    }
    static class FinalObject{
        String s;
        public FinalObject() {
        }

        public FinalObject(String s) {
            this.s = s;
        }
    }
}
