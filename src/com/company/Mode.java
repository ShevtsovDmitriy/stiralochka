package com.company;


public class Mode {

    private int temperature;
    private  int speed;
    private boolean extraction;
    private int time;

    public Mode(Integer mode) {
        if (mode == 1){
            temperature = 40;
            speed = 600;
            extraction = false;
            time = 50;
        }if (mode == 2){
            temperature = 60;
            speed = 800;
            extraction = true;
            time = 70;
        }if (mode == 3){
            temperature = 90;
            speed = 1000;
            extraction = true;
            time = 90;
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isExtraction() {
        return extraction;
    }

    public void setExtraction(boolean extraction) {
        this.extraction = extraction;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
