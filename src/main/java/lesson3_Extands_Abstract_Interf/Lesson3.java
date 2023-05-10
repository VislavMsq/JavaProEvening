package lesson3_Extands_Abstract_Interf;

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

    Интерфейс - это абстрактный класс доведенный до совершенства, в интерфейсе все методы абстрактные
 */


public class Lesson3 {
    public static void main(String[] args) {
        // общий тип для наших классов стал интерфейс
        IAnimal[] animals = {new Cat("Mara", "Grey", 3), new Dog("Tuzik", "Brown", 5)};
        for (IAnimal animal : animals) {     // полиморфизм - используем с общим классом Animal с общим методом voice
        System.out.println(animal.voice()); // и благодаря этому запускается два наших класса cat - dog
        System.out.println(animal);
        }
    }
}