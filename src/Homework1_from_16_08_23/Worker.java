package Homework1_from_16_08_23;

public class Worker extends Person implements AbleToCalculatePension {

private static double PERCENT_OF_PENSION = 0.25;
    private int minSalary;
    private int maxSalary;

    public Worker(String name, int age, double height, double weight, int money) {
        super(name, age, height, weight, money);
    }

    public Worker(int minSalary) {
        super();
        this.minSalary = minSalary;
    }

    public Worker(double maxSalary) {
        super();
        this.maxSalary = (int) maxSalary;
    }

    @Override
    public double calculatePension() {
        if (getIsGender() == null){
            return 0.0;
        }
        double averageSalary;

        if (getIsGender() == GenderTypes.FEMALE) {
            averageSalary = CalculatorUtils.calculateAverage(minSalary / 2, maxSalary * 2);
        } else {
            averageSalary = CalculatorUtils.calculateAverage(minSalary, maxSalary);
        }
        return averageSalary * PERCENT_OF_PENSION;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public static double getPercentOfPension() {
        return PERCENT_OF_PENSION;
    }

    public static void setPercentOfPension(double percentOfPension) {
        PERCENT_OF_PENSION = percentOfPension;
    }

    @Override
    public void die() {
        super.die();
        System.out.println("Этот человек не доживет до пенсии");
    }

    @Override
    public void die(int years) {
        System.out.println("Этот человек не доживет до пенсии и умрет через " + years + "лет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Worker worker = (Worker) o;

        if (minSalary != worker.minSalary) return false;
        return maxSalary == worker.maxSalary;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + minSalary;
        result = 31 * result + maxSalary;
        return result;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                '}';
    }
}

