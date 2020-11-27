package com.test1;

import com.hello.Hello;
import com.test2.Hi;

public class Main {
    public static void main(String[] args) {
        //Version 1
        Hello hello = new Hello();
        System.out.println(hello.sayHello());

        //Version 2
        Hi hi = new Hi();
        System.out.println(hi.greeting());
    }
}
