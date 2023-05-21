package lesson6;

import java.util.Arrays;

public class RubberArray {
    private int[] array;

    public RubberArray() {
        array = new int[0];
    }

    public void add(int value) {     // метод для добавления элемента
        int[] newArray = new int[array.length + 1];    // создаем новй массив и добавляем в него длинну на 1 больше, чем наш старый
        System.arraycopy(array, 0, newArray, 0, array.length); // копируем элементы со старого массива в новый
        newArray[array.length] = value;     // увеличивам массив на один элемент к его конец
        array = newArray;       // заменяем ссылки на массив старый на новый
    }

    public void add(int value, int index){
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = value;
        System.arraycopy(array, index, newArray, index + 1, array.length - index);
        array = newArray;
    }

    public int get(int index) {     // обращаемся к элементу по индексу
        return array[index];        // возвращаем индекс
    }

    public void remove(int index) {     // метод для удаления
        int[] newArray = new int[array.length - 1];     // создаем новый массив
        System.arraycopy(array, 0, newArray, 0, index );    // копируем левые элементы со старого массива в новый
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);  // копируем правые элементы со старого массива в новый
        array = newArray;     // присваеваем наш старый массив к новому, пресоздаем
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        return sb.append("]").toString();  // append - добовляет строку к элементу, а потом преводим ее через toString
    }
}
