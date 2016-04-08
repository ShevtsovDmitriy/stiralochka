package com.company;

/**
 * Created by ִלטענטי on 08.04.2016.
 */
public class Boiler {

    public void warm(int temp){
        System.out.println("boiler activated");
        try {
            Thread.sleep(temp*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("water was warm");
    }

}
