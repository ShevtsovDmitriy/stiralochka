package com.company;


public class Stiralochka {
    private Boiler boiler = new Boiler();
    private Motor motor = new Motor();
    private Pump pump = new Pump();
    private Mode mode;
    private PowderContainer powderContainer = new PowderContainer();
    private Tank tank = new Tank();
    private boolean isDoorOpen = true;
    private boolean isPowder = false;
    private int clothes = 0;

    public void start(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true){
            String answer = scanner.nextLine();
            if (answer.equals("open door")) {
                if (isDoorOpen) {
                    isDoorOpen = false;
                    System.out.println("door open");
                }else {
                    System.out.println("door already open");
                }
            } else if (answer.equals("close door")) {
                if (!isDoorOpen) {
                    isDoorOpen = true;
                    System.out.println("door closed");
                }else {
                    System.out.println("door already closed");
                }
            } else if (answer.equals("put clothes")) {
                if (isDoorOpen) {
                    System.out.println("open the door");
                }else if (clothes < 5) {
                    clothes++;
                    System.out.println("Clothes was put");
                }
                else
                    System.out.println("too mach clothes");
            } else if (answer.equals("put powder")) {
                if (!isPowder) {
                    isPowder = true;
                    System.out.println("powder was put");
                }else {
                    System.out.println("powder already are put");
                }
            } else if (answer.equals("set mode")) {
                System.out.println("Choose mode\n 1:\n 2:\n 3:");
                answer = scanner.nextLine();
                mode = new Mode(Integer.decode(answer));
                System.out.println("mode chosen");
            } else if (answer.equals("start")) {
                if (!isDoorOpen){
                    System.out.println("closed the door");
                }else if (!isPowder){
                    System.out.println("you forgot a powder");
                }else if (clothes == 0)
                    System.out.println("you forgot a clothes");
                else {
                    System.out.println("Stirka nachalas`");
                    startStirka();
                    System.out.println("Stirka zakonchilas`");
                }
            } else if (answer.equals("exit")) {
                break;
            }
        }
    }

    private void startStirka(){
        pump.start(10);
        boiler.warm(mode.getTemperature());
        motor.start(50);
        try {
            Thread.sleep(mode.getTime()*100/2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        motor.stop();
        powderContainer.PutPowder();
        motor.start(50);
        try {
            Thread.sleep(mode.getTime()*100/2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        motor.stop();
        pump.pourOff();
        if (mode.isExtraction()){
            System.out.println("extraction");
            motor.start(mode.getSpeed());
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            motor.stop();
        }
        System.out.println("end");

    }


}
