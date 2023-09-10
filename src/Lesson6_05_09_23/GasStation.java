package Lesson6_05_09_23;

public class GasStation {
    public void refuel(Refuelable a) {
        System.out.println("К зарправке подъехал " + a.toString());
        a.refuel();
    }

}
