package com.edureka;

public class HelloWorld {
    // here i cannot call, need crete a object class
    public void nonStaticTest(){
        System.out.println("Non static method print test");
    }
    // here i can call inside main without object created
    public static void StaticVoid(){
        System.out.println("Here java static will be call");
    }

    public static void main (String[] args){
        HelloWorld helloNonStaticObject = new HelloWorld();
        System.out.println("Hello World");
        //here I call the object
        helloNonStaticObject.nonStaticTest();
        // here I without call any object
        StaticVoid();
    }
}
