package com.company;


public class Pump {

    private int volume;

    public void start(int volume){
        System.out.println("pomp activated");
        this.volume = volume;
        try {
            Thread.sleep(volume*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("pomp stopped");

    }

    public void pourOff(){
        try {
            Thread.sleep(volume*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("pour off water");
    }


}
