package Homework1_from_16_08_23;

public class Person {
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
    private String name;
    private int age;
    private double height;
    private double weight;
    private int money;

    //Конструктор с 4 аргументами
    public Person(String name, int age, double height, double weight, int money) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.money = money;

    }

    public void infoOfPerson() {
        System.out.println("Имя: " + name + ", Возраст: " + age + " лет" + ", Рост: " + height + " см" + ", Вес: " + weight + " кг");
        System.out.println("Зарплата: " + money + "$");
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
}
