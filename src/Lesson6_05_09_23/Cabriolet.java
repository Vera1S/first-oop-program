package Lesson6_05_09_23;

public class Cabriolet extends Car implements Refuelable, Comparable<Cabriolet> {

    public boolean isOpened;
    private EngineType engineType;

    public Cabriolet(int id, String model, String color, int currentSpeed, boolean isOpened) {
        super(id, model, color, currentSpeed);
        this.isOpened = isOpened;
    }

    @Override
    public void drift() {
        System.out.println("Кабриолет не для дрифта, грязь залетела через открытое окно...");
    }

    @Override
    public void refuel() {
        System.out.println("кабриолет зарпавили бензином с высоким октановым числом, 95+");
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public int compareTo(Cabriolet o) {
        return 0;
    }
}