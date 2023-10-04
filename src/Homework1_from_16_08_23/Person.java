package Homework1_from_16_08_23;

import java.util.Objects;
//    Задача № 1 от 16.08.2023г
//    Создать класс Person.
//2) В нем добавить такие поля:
//а) Имя человека (выбрать самостоятельно тип данных)
//б) Возраст человека (выбрать самостоятельно тип данных)
//в) Рост (выбрать самостоятельно тип данных)
//г) Вес (выбрать самостоятельно тип данных)
//3) Добавить конструктор. Можно конструктор сгенерировать, но лучше написать самому
//4) Добавить методы:
//a) Инфо о человеке. Печатает информацию о человеке - сколько лет, его имя рост и все.
//б) Идти на работу. Если возраст меньше 18 или больше 70, то пишет "отдыхаю дома", иначе "работаю"
//5) Создать несколько объектов и заполнить их
//Доп. задание:
//6) Добавить поле "money" и создать метод getMoney, который делает return money (То есть просто возвращает
// количество денег у человека). Мы это тему еще не проходили, поэтому подсказки в личные сообщения просите спокойно.
//7) перед int money переменной поставить ключевое слово private. Описать, что произойдет в программе.
public abstract class Person  {

    private String name;
    private int age;
    private double height;
    private double weight;
    private int money;
    private GenderTypes isGender;

    //Конструктор с 4 аргументами
    public Person(String name, int age, double height, double weight, int money) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.money = money;
    }

    public Person() {

    }

    public void infoOfPerson() {
        System.out.println("Имя: " + name + ", Возраст: " + age + " лет" + ", Рост: " + height + " см" + ", Вес: " + weight + " кг");
        System.out.println("Ежемесячная сумма: " + money + "$");
    }
    public String goToWent() {
        if (age < 18 || age > 70) {
            return "Отдыхаю дома";
        } else {
            return "Работаю";
        }
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getMoney(int money) {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public GenderTypes getIsGender() {

        return isGender;
    }

    public void setIsGender(GenderTypes isGender) {

        this.isGender = isGender;
    }

    public void die(){
        System.out.println("Человек погиб");
           }
           public abstract void die(int years);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (Double.compare(person.height, height) != 0) return false;
        if (Double.compare(person.weight, weight) != 0) return false;
        if (money != person.money) return false;
        if (!Objects.equals(name, person.name)) return false;
        return isGender == person.isGender;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + money;
        result = 31 * result + (isGender != null ? isGender.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", money=" + money +
                ", isGender=" + isGender +
                '}';
    }


}
