package com.pshekha.calculator;

/**
 * Created by krrathore on 12/12/18.
 */

public class Calculate {

    public int calculateValue(int a,int b,String operator){
        int value = Integer.MIN_VALUE;

        System.out.println("Calculate:" + a);
        System.out.println("Calculate:" + b);

        System.out.println("Calculate:" + operator);

        if(operator.equals("+"))
        {
            value = a + b;
        }

        if(operator.equals("-"))
        {
            value = a - b;
        }

        if(operator.equals("*"))
        {
            value = a * b;
        }

        if(operator.equals("/"))
        {
            value = a/b;
        }
      return value;


    }
}
