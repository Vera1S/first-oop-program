package Lesson6_05_09_23;

import java.util.ArrayList;

public class GasStation {
    private ArrayList<Cabriolet> cabriolets;

    public void refuel(Refuelable a) {
        System.out.println("К зарправке подъехал " + a.toString());
        a.refuel();
    }

    public void printInfoAboutQueue() {
        if (cabriolets == null) {
            System.out.println("Очередь не существует");
            return;
        }

        System.out.println("Сейчас очередь из автомобилей составляет " + cabriolets.size());
        System.out.println("Вот эти машины " + cabriolets);
    }

    public ArrayList<Cabriolet> getCabriolets() {
        return cabriolets;
    }

    public void setCabriolets(ArrayList<Cabriolet> cabriolets) {
        this.cabriolets = cabriolets;
    }
}
