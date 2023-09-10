package Lesson6_05_09_23;
public class MainGasStation {

    public static void main(String[] args) {
        GasStation gasStation = new GasStation();

        Jeep jeep = new Jeep();
        System.out.println(jeep.getType());

        Cabriolet cabriolet = new Cabriolet(1, "BMW", "black", 0, true);
        Airplane airplane = new Airplane();
        Ship ship = new Ship();

        gasStation.refuel(jeep);
        gasStation.refuel(cabriolet);
        gasStation.refuel(airplane);
        gasStation.refuel(ship);

        jeep.setType(TransmissionType.MECHANIC);
        cabriolet.setType(TransmissionType.AUTO);

        TransmissionType jeepType = jeep.getType();
        TransmissionType cabrioletType = cabriolet.getType();

        System.out.println(jeepType);
        System.out.println(cabrioletType);

        System.out.println(jeepType == cabrioletType);
        System.out.println(jeepType.equals(cabrioletType));

        jeep.setCost(100_000);
        cabriolet.setCost(100_000);

        System.out.println(jeep.getCost());
        System.out.println(cabriolet.getCost());


    }

}
