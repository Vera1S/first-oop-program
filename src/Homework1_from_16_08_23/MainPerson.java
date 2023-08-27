package Homework1_from_16_08_23;

public class MainPerson {
    public static void main(String[] args) {

        Person person1 = new Person("Vera", 17, 170, 65, 800);
        Person person2 = new Person("Nikolai", 42, 180,80.5,  2500);
        Person person3 = new Person("Svetlana", 70, 165, 65.8, 6500);

        person1.infoOfPerson();
        person2.infoOfPerson();
        person3.infoOfPerson();
        System.out.println();
        System.out.println(person1.getName() + "-" + person1.getMoney(2500) + "$");
        System.out.println(person2.getName() + "-" + person2.getMoney(4000) + "$");
        System.out.println(person3.getName() + "-" + person3.getMoney(1500) + "$");

        person1.setMoney(100);
        person1.goToWent();
        person2.goToWent();
        person3.goToWent();


    }
}
