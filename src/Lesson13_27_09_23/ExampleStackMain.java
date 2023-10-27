package Lesson13_27_09_23;

import java.util.Stack;

public class ExampleStackMain {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);   // Добавляем цифру в стек
        stack.push(2);
        stack.push(3);

        System.out.println(stack);  // Вывод стека на экран [1, 2, 3] в командной строке

        System.out.println(stack.peek()); //Просматривает объект в верхней части этого стека - это 3, не удаляя его из стека.
        System.out.println(stack);

        System.out.println(stack.pop()); // LIFO Удаляет объект, находящийся в верхней части этого стека
        System.out.println(stack); // В командной строке отобразился стек [1, 2]

        System.out.println(stack.pop()); //Удалили 2 из стека, находящийся в верхней части этого стека
        System.out.println(stack); // В командной строке отобразился стек, с оставшейся 1

        String str1 = "(())(())))(((())))(((())))";
        String str2 = "()()";
        String str3 = "(((((";
        String str4 = "())(";

        String str5 = "((4+5)*4+5)";

        String str6 = "(){}[]";
        String str7 = "{4+5*[2-(2*(2+2)]}";

// к концу строки должна ровняться 0

        int value = 0;
        boolean isCorrect = true; // перепроверить по буленскому значению true или false
        for (int i = 0; i < str1.length(); i++) { // считаем вложенность скобочек от 0 до длинны строки
            char symbol = str1.charAt(i);         //обозначаем символом
            if (symbol == '(') {  // если символ ровняется скобочки открывающиеся, то переменная value++
                value++;
            }
            if (symbol == ')') { //если символ ровняется скобочки закрывающиеся, то переменная value--
                value--;
            }
            if (value < 0) {  // если вложенность (переменная) меньше 0, то "не верно"
                isCorrect = false;  //если переменная будет, хоть один раз меньше 0, то эта строка перестает быть верной
                System.out.println("не верно");
            }
        }
        if (value > 0){  //а также строка перестает быть верной, если переменная (value) к концу больше 0
            isCorrect = false;
    }
        System.out.println(isCorrect); //Результат выводим.
//        if (value == 0) { //если переменная по итогу ровна 0, то "верно",
//            System.out.println("верно");
//        }
//        else {
//            System.out.println("не верно"); //а иначе "не верно"
//        }

        //Задача вариант 2

//        public class MainStack {
//            public static void main(String[] args) {
//                String encodedMessage = "(Приве)(т, ми)р";
//
//                Stack<Character> stack = new Stack<>();
//                for (char c : encodedMessage.toCharArray()) {
//                    if (c == ')') { //убираем скобки
//                        StringBuilder word = new StringBuilder();
//                        // Переворачиваем и выводим буквы слова
//                        System.out.print(word.reverse().toString());
//                    } else if (c == '(') {
//
//                    } else {
//
//                        stack.push(c);// Добавляем буквы в стек
//                    }
//
//
//// Выводим оставшиеся буквы, если есть
//
//                    while (!stack.isEmpty()) {
//
//                        System.out.print(stack.pop());
//                    }
//
//                }
//            }
//        }

        //Вариант 3 к задаче

//        public static void main(String[] args) {
//            String encodedMessage = "евирпим, тр";
//
//            Stack<Character> stack = new Stack<>();
//            for (char c : encodedMessage.toCharArray()) {
//
//                stack.push(c);// Добавляем буквы в стек
//                if (stack.size() == 5) {
//                    while (!stack.isEmpty()) {
//                        System.out.print(stack.pop());
//                    }
//                }
//
//            }
//
// Выводим оставшиеся буквы, если есть
//
//            while (!stack.isEmpty()) {
//
//                System.out.print(stack.pop());
//            }
//
//        }
//    }
        //Вариант 4 к задаче

        // public static void main(String[] args) {
        //        System.out.println("Hello world!");
        //        decode("123456789");
        //    }
        //
        //    public static void decode(String code) {
        //        if (code == null) {
        //            return;
        //        }
        //
        //        Stack<Character> stack = new Stack<>();
        //        for (int i = 0; i < code.length(); i++) {
        //            char symbol = code.charAt(i);
        //            stack.push(symbol);
        //            if (stack.size() == 5 || i == code.length() - 1) {
        //                while (!stack.isEmpty()) {
        //                    System.out.println(stack.pop());
        //                }
        //            }
        //        }
        //
        //        System.out.println(stack);
        //
        //    }

    }
}