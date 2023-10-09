package Lesson6_05_09_23;

import java.util.ArrayList;
import java.util.Set;

public class GasStation {
    private ArrayList<Cabriolet> cabriolets;
    private Set<EngineType> availableEngineTypes;

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
    public void refuelAll() {
        if (cabriolets == null || cabriolets.size() == 0) {
            return;
        }

        for (Cabriolet cabriolet : cabriolets) {
            if (cabriolet.getEngineType() != null
                    && availableEngineTypes != null
                    && availableEngineTypes.contains(cabriolet.getEngineType())) {
                cabriolet.refuel();
            }
        }

        cabriolets.clear();
    }
    public ArrayList<Cabriolet> getCabriolets() {
        return cabriolets;
    }

    public void setCabriolets(ArrayList<Cabriolet> cabriolets) {
        this.cabriolets = cabriolets;
    }

    public Set<EngineType> getAvailableEngineTypes() {
        return availableEngineTypes;
    }

    public void setAvailableEngineTypes(Set<EngineType> availableEngineTypes) {
        this.availableEngineTypes = availableEngineTypes;
    }
}
