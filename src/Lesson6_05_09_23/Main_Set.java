package Lesson6_05_09_23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main_Set {
    public static void main(String[] args) {

        GasStation gasStation = new GasStation();

        List<Cabriolet> cabriolets = new ArrayList<>();
        Cabriolet cabrioletFirst = new Cabriolet(1, "BMW", "black", 0, true);
        cabrioletFirst.setEngineType(EngineType.GAS);
        Cabriolet cabrioletSecond = new Cabriolet(1, "BMW", "black", 0, true);
        cabrioletSecond.setEngineType(EngineType.ELECTRO);
        cabriolets.add(cabrioletFirst);
        cabriolets.add(cabrioletSecond);

        gasStation.setCabriolets((ArrayList<Cabriolet>) cabriolets);

        Set<EngineType> engineTypes = new HashSet<>();
        engineTypes.add(EngineType.DIESEL);
        engineTypes.add(EngineType.GAS);
        engineTypes.add(EngineType.MECHANIC);

        gasStation.setAvailableEngineTypes(engineTypes);

        gasStation.refuelAll();
    }
}
