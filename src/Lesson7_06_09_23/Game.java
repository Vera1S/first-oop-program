package Lesson7_06_09_23;

    import java.util.Scanner;

    public class Game {

        private MessagePrinter messagePrinter;
        private Scanner scanner;

        public Game(MessagePrinter messagePrinter, Scanner scanner) {
            this.messagePrinter = messagePrinter;
            this.scanner = scanner;
        }

        public void start(Field field) {

            messagePrinter.printInfo();
            int row = scanner.nextInt();
            messagePrinter.printSecondNumber();
            int column = scanner.nextInt();

            boolean result = field.checkCell(row, column);

            if (result) {
                messagePrinter.printWinMessage();
            }
            else {
                messagePrinter.printLoseMessage();
            }
        }
}
