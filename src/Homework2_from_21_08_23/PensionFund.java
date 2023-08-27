package Homework2_from_21_08_23;

public class PensionFund {
//    У вас есть класс Person.
//1) Сделать его правильным - создать геттеры и сеттеры, проверить, что он соответствует тем правилам,
// которые мы с вами обсуждали.

//2) Создайте класс пенсионный фонд, в нем создайте такие поля:

//а) Именование пенсионного фонда
//б) булеан переменная, явлется ли он государственным
//в) Дата создания
//г) количество участников фонда

//3) Добавьте сетеры и гетеры этому классу, заблокируйте прямой доступ к переменным.

//4) Добавьте метод "info" - выводит информацию по фонду. Если фонд государственный, то
// информация должна содержать строку о том, сколько ТЫСЯЧ человек используют фонд.
// Для не-государственных - сколько человек используют фонд (не ТЫСЯЧ)

    //5) Запретить менять дату создания фонда (отобрать сеттер)
    private String pensFundName;
    public boolean gos;
    private String dateOfCreation;
    private int numOfFundParticipants;

    public PensionFund(String pensFundName, String dateOfCreation, boolean gos, int numOfFundParticipants) {
        this.pensFundName = pensFundName;
        this.gos = gos;
        this.dateOfCreation = dateOfCreation;
        this.numOfFundParticipants = numOfFundParticipants;


    }

    public String getPensFundName() {
        return pensFundName;
    }

    public boolean isGos() {
        return gos;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public int getNumOfFundParticipants() {
        return numOfFundParticipants;
    }

    public void setGos(boolean gos) {
        this.gos = gos;
    }

    public void setNumOfFundParticipants(int numOfFundParticipants) {
        this.numOfFundParticipants = numOfFundParticipants;
    }

    public void infoState() {

        if (gos) {
            System.out.println("Государственный фонд: " + numOfFundParticipants / 1000 + " тысяч человек используют фонд");
        } else {
            System.out.println("Негосударственный фонд: " + numOfFundParticipants + " человек используют фонд");

        }


    }
}



