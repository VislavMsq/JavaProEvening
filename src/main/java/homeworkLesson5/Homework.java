package homeworkLesson5;

import java.io.PrintStream;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

/**
 * JavaProEvening
 * Homework 16.05
 * Vladislav Mosiuk
 */

public class Homework {
    public static void main(String[] args) {
/*
1.
Имеется текст (10-20 слов, должны встречаться повторяющиеся) без знаков препинания и больших букв. Получить массив
слов из текста. Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать,
сколько раз встречается каждое слово.
 */
        // 1.
        String text = "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore" +
                " et dolore magna aliqua Ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut " +
                "aliquip ex ea commodo consequat Duis aute irure dolor in reprehenderit in voluptate velit esse cillum " +
                "dolore eu fugiat nulla pariatur Excepteur sint occaecat cupidatat non proident sunt in culpa qui officia " +
                "deserunt mollit anim id est laborum";


        String words[] = text.toLowerCase().split(" "); // make arrays and use lowerCase witch split
        System.out.println(Arrays.toString(words));           // called methode arrays

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println("Unique Words " + uniqueWords);

        for (String word : uniqueWords) {
            int count = 0;
            for (String w : words) {
                if (word.equals(w)) {
                    count++;
                }
            }
            System.out.println("Word: " + word + ", Count: " + count);
        }
/*
2.
Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров. В этот
телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по
фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при
запросе такой фамилии должны выводиться все телефоны.
 */
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Tomas", 123123123);
        phoneBook.add("Jeson", 312312312);
        phoneBook.add("Tomas", 123167834);
        System.out.println(phoneBook.get("Tomas"));
    }
}

