package Lesson10_18_09_23;
import Lesson10_18_09_23.FirstArrayList;

public class MainFirstArrayList {
    public static void main(String[] args) {
        FirstArrayList firstArrayList = new FirstArrayList();
        firstArrayList.add(5);
        for (int i = 0; i < 10; i++){
            firstArrayList.add(7);
        }
        System.out.println(firstArrayList.toString());
        System.out.println(firstArrayList.contains(3));
        firstArrayList.addWithoutNewArray(5, 6);
        System.out.println(firstArrayList);
        firstArrayList.trimToSize();
    }


}
