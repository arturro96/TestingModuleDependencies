package com.test2;

import com.hello.Hello;

public class Hi {
    public String greeting(){
        Hello hello = new Hello();
        return hello.sayHello();
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        System.out.println(hello.sayHello());
    }
}
