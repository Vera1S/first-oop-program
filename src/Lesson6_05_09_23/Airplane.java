package Lesson6_05_09_23;

public class Airplane implements Refuelable {

    private String type;

    private String serialNumber;

    @Override
    public void refuel() {
        System.out.println("Самолет заправляют только сотым бензином (АИ100) + керосином");
    }

    public void fly() {
        System.out.println("Летиии");
    }

}
