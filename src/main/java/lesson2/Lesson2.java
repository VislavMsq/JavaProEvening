package lesson2;

/*
Теория:
    Перегрузка - это когда в методах с одинаковыми названиями будут использоваться разные аргументы
    Конструктор - инициализирует поля класса, создает их
    toString - только читает поля класса

    Инкапсуляция:
        Связывание - связывает поля(данные) и методы(действия)
        Сокрытие - все поля закрывают

    Геттер - обращается к полю, вызывает его - public String getName() - не имеет аргументов, делает return
    Сеттер - дает возможность изменить поле -  public void setName(String name) - имеет аргумент, ничего не возвращает

 */



public class Lesson2 {
    public static void main(String[] args) {
        Cat cat = new Cat("Mara", "Grey", 3);
        System.out.println(cat.voice());
        System.out.println(cat);
        cat.setName("Bars");
        System.out.println("Name: " + cat.getName());

        Cat catNull = new Cat();



    }
}
