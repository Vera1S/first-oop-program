package Lesson7_06_09_23;

import java.util.Scanner;

public class Game {

    private MessagePrinter messagePrinter;
    private Scanner scanner;
    private final static int SHOTS_FIRED = 2;
    private int counter = 0;

    public Game(MessagePrinter messagePrinter, Scanner scanner) {
        this.messagePrinter = messagePrinter;
        this.scanner = scanner;
    }

    public void start(Field field) {

        for (int i = 0; i < SHOTS_FIRED; i++){

        messagePrinter.printInfo();
        int row = scanner.nextInt();
        messagePrinter.printSecondNumber();
        int column = scanner.nextInt();

        boolean result = field.checkCell(row, column);
        if (result) {
            messagePrinter.printWinMessage();
            counter++;
        } else {
            messagePrinter.printLoseMessage();
        }
        }
        System.out.println("Количество ваших очков: " + counter);
    }
}
