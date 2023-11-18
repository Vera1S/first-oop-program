package Homework20_from_23_10_23;

public class Parson {
    private String name;
    private int minSalary;
    private int maxSalary;
    private Gender gender;

    public Parson(String name, int minSalary, int maxSalary, Gender gender) {
        this.name = name;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.gender = gender;
    }
    public Parson(String str){
        str.split()
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Parson{" +
                "name='" + name + '\'' +
                ", minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                ", gender=" + gender +
                '}';
    }
}
