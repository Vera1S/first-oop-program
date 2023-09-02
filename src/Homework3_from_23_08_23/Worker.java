package Homework3_from_23_08_23;

import Homework1_from_16_08_23.Person;

public class Worker extends Person {

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

    public int getMinSalary(){
        return minSalary;
    }
    public int getMaxSalary(){
        return maxSalary;
    }
    public void setMinSalary(){
        this.minSalary = minSalary;
    }
    public void setMaxSalary(){
        this.maxSalary = maxSalary;
    }


    @Override
    public void die() {
        super.die();
        System.out.println("Этот человек не доживет до пенсии");
    }

    @Override
    public void die(int years){
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
