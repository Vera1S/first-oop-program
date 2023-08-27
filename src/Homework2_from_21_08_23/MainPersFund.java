package Homework2_from_21_08_23;

public class MainPersFund {
    public static void main(String[] args) {

        PensionFund stateFund = new PensionFund("Ромашка", "2000 years", true, 3000);
        PensionFund noStateFund = new PensionFund("Ромашка", "2015 год", false, 300);


        stateFund.setNumOfFundParticipants(15000);
        System.out.println(stateFund.getNumOfFundParticipants());


        noStateFund.setNumOfFundParticipants(850);
        System.out.println(noStateFund.getNumOfFundParticipants());
        stateFund.infoState();
        noStateFund.infoState();
    }

}
