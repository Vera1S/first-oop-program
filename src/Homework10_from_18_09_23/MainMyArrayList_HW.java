package Homework10_from_18_09_23;

public class MainMyArrayList_HW {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        for (int i = 0; i < 10; i++){
            myArrayList.add(7);
        }
        System.out.println(myArrayList.toString());
        System.out.println(myArrayList.contains(3));
        myArrayList.addWithoutNewArray(5, 6);
        System.out.println(myArrayList);
        myArrayList.trimToSize();
    }
}
