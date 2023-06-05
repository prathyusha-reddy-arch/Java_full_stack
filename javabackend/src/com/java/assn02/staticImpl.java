package com.java.assn02;

public class staticImpl {

    static int staticValue;
    static int staticMethod(int x){
        staticValue = x;
        return staticValue;
    }
    static {
        System.out.println(staticMethod(6));
    }
}
