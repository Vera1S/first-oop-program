package Homework1_from_16_08_23;

import Homework2_from_21_08_23.PensionFund;
import Homework3_from_23_08_23.Pensioner;
import Homework3_from_23_08_23.Worker;

public class MainPerson {
    public static void main(String[] args) {

        Person person1 = new Person("Vera", 17, 170, 65, 800);
        Person person2 = new Person("Nikolai", 42, 180, 80.5, 2500);
        Person person3 = new Person("Svetlana", 72, 165, 65.8, 6500);

        PensionFund stateFund = new PensionFund("Ромашка", "2000 years", true, 3000);
        PensionFund noStateFund = new PensionFund("Ромашка", "2015 год", false, 300);

        Pensioner pensioner = new Pensioner("Anton", 55, 175, 75, 150000, 525);
        Worker worker = new Worker("Katerina", 35, 175, 65, 4500);

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
        System.out.println();
        pensioner.getPension();
        pensioner.die();
        worker.die();


    }
}
