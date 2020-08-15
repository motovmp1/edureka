package com.edureka;

public class Calculator {
    public Integer add (Integer arg1, Integer arg2 ){
        arg1 = 100;
        Integer result_add = (arg1+arg2);
        return result_add;
    }

    public Integer multiply (Integer arg3, Integer arg4 ) {
        Integer result_multiply = (arg3 * arg4);
        return result_multiply;

    }

    public Integer add (Integer arg1, Integer arg2, Integer arg3 ) {
        Integer result_add = (arg1 + arg2 + arg3);
        return result_add;

    }


    public static void main (String[] args) {
        Calculator cal1 = new Calculator();
        int arg1 = 10;
        int arg2 = 30;
        int arg3 = 40;
        System.out.println("here is the arg1 before passing: " + arg1);
        Integer result_add = cal1.add(arg1, arg2);
        System.out.println("here is the arg1 after passing to method : " + arg1);
        System.out.println("Result of addition is : " + result_add);
        Integer result_multiply =  cal1.multiply(10, 20);
        System.out.println("Result of addition is : " + result_multiply);
        Integer resultNewMethod = cal1.add(arg1, arg2, arg3);
        System.out.println("This is overloading: " + resultNewMethod);
    }
}
