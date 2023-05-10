package lesson3_Extands_Abstract_Interf;

public abstract class Animal implements IAnimal{  // если в классе есть абстрактный метод, то и класс должен быть абстрактным
    protected String name;
    protected String color;
    protected int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

//    public abstract String voice();  // контракт на абстракцию

    @Override
    public String toString() {
        return ": " +
                "name: " + name +
                ", color: " + color +
                ", age: " + age
                ;
    }
}
