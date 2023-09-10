package Homework1_from_16_08_23;

public class MainPerson {
    public static void main(String[] args) {
//        задание № 4 от 28.08.2023г
// 1) Создайте метод public void die(int years) в классе Person, сделайте его абстрактным.
// Этот метод будет отличаться от обычного die() тем, что человек будет умирать не сразу, а через некоторое количество
// лет (которые и будут передаваться в параметре метода). Реализуйте этот метод для  Pensioner и Worker таким образом:
//а) для Worker просто вывести на экран "Этот человек не доживет до пенсии и умрет через " + years + "лет"
//б) Для Pensioner пишем на экран "Этот пенсионер умрет через" + years + "лет"
//2) Все классы, которые созданы, снабжаем собственными реализациями методов equals, hashCode и toString
//3) Добавить для класса Worker несколько конструкторов (перегрузка)

        Person person1 = new Worker("Vera", 17, 170, 65, 800);
        Person person2 = new Worker("Nikolai", 42, 180, 80.5, 2500);
        Person person3 = new Pensioner("Svetlana", 72, 165, 65.8, 6500, 365);

        PensionFund stateFund = new PensionFund("Ромашка", "2000 years", true, 3000);
        PensionFund noStateFund = new PensionFund("Ромашка", "2015 год", false, 300);

        Pensioner pensioner = new Pensioner("Anton", 55, 175, 75, 150000, 365);
        Worker worker1 = new Worker("Katerina", 35, 175, 65, 4500);
        Worker worker2 = new Worker("Konstantin", 37, 176, 70, 4500);
        Worker worker3 = new Worker("Maria", 40, 173, 68, 4500);

        person1.infoOfPerson();
        person2.infoOfPerson();
        person3.infoOfPerson();
        System.out.println();
        System.out.println(person1.getName() + " я учусь и получаю степендию - " + person1.getMoney(9600) + "$ в год");
        System.out.println(person2.getName() + " " + person2.goToWent() + " как проклятый до пенсии долеко - " + person2.getMoney(30000) + "$ в год");
        System.out.println(person3.getName() + " " + person3.goToWent() + " моя пенсия - " + person3.getMoney(18000) + "$ в год");
        System.out.println();
        stateFund.setNumOfFundParticipants(15000);
        System.out.println(stateFund.getNumOfFundParticipants());

        noStateFund.setNumOfFundParticipants(850);
        System.out.println(noStateFund.getNumOfFundParticipants());
        stateFund.infoState();
        noStateFund.infoState();
//        stateFund.gos = true;
//        stateFund.gos = false;
        System.out.println();
        pensioner.getPension();
        pensioner.die();
        pensioner.die(50);
        worker1.die();
        worker2.die(55);
        System.out.println("-------------Пол" + worker1 + GenderTypes.FEMALE);
        System.out.println("-------------Пол" + worker2 + GenderTypes.MALE.name());
        worker1.setIsGender(GenderTypes.FEMALE);
        worker2.setIsGender(GenderTypes.MALE);

        GenderTypes worker1Gender = worker1.getIsGender();
        GenderTypes worker2Gender = worker2.getIsGender();

        System.out.println(worker1Gender);
        System.out.println(worker2Gender);

        CalculatorUtils.calculateAvege(5, 5.0);


    }
}
