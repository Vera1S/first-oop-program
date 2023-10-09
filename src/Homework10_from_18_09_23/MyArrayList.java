package Homework10_from_18_09_23;
import java.util.Arrays;
// Задача от 18.09.2023г

//В нашей реализации ArrayList (которая называется MyArrayList)
//реализуйте самостоятельно такие методы
//1) size()  - метод, аналогичный методу size() из обычного
// arrayList - он возвращет реальный размер листа
//2) add(index, value) - метод add, только который вставляет значение
// не в конец списка, а в любое произвольное место (место задается
//переменной index)
//3) remove(int index) - аналог remove из классического ArrayList - удаляет
//элемент из листа по индексу
public class MyArrayList {

        private int[] array;
        private int size;

        public MyArrayList(){
            array = new int[10];
        }

        public void add(int value){
            if(size == array.length){
                grow();
            }
            array[size] = value;
            size++;
        }

        private void grow(){
            int[] newArray = new int[array.length * 2];

            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

        public boolean contains(int element){
            for (int i = 0; i < size; i++) {
                if(array[i] == element){
                    return true;
                }
            }
            return false;
        }

    public int size(){
        if(array == null){
            return 0;
        }
        int size = 0;
        for (int i = 0; i < array.length; i++) {
//            if (array[i] != 0) {
//                size++;
//            }
            size = (array[i] !=0) ? ++size : size;
        }
        return size;
    }
    public void addWithoutNewArray(int index, int element){
        add(element);
        int temp = array[index];
        array[index] = array[size() - 1];
        for (int i = size - 1; i >= index + 2; i--) {
            array[i] = array[i - 1];
        }
        array[index + 1] = temp;
    }

    public void addWithNewArray(int index, int element){
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = element;
        for (int i = index + 1; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }
        array = newArray;
        size++;
    }
    public void remove(int index){
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
        size--;
    }
    public void trimToSize(){
        int[] newArr = new int[size];
        for (int i = 0; i < size; i++) {
            newArr[i] = array[i];
        }
        array = newArr;
    }

        @Override
        public String toString() {
            return "MyArrayList{" +
                    "array=" + Arrays.toString(array) +
                    ", size=" + size +
                    '}';
        }
    }


