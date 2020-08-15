package com.edureka;

public class HelloWorld {
    // here i cannot call, need crete a object class
    public void nonStaticTest(){
        System.out.println("Non static method print test");
    }

    public static void StaticVoid(){
        System.out.println("Here java static will be call");
    }

    public static void main (String[] args){
        HelloWorld helloNonStaticObject = new HelloWorld();
        System.out.println("Hello World");
        helloNonStaticObject.nonStaticTest();
        StaticVoid();
    }
}
