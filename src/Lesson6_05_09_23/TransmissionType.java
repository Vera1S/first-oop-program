package Lesson6_05_09_23;

public enum TransmissionType {
    AUTO(1.3),
    MECHANIC(1.0),
    AI(2.0);

    private final double coefficientOfCost;

    TransmissionType(double coefficientOfCost) {
        this.coefficientOfCost = coefficientOfCost;
    }

    public double getCoefficientOfCost() {
        return coefficientOfCost;
    }
}
