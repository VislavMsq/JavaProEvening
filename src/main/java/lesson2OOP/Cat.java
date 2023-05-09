package lesson2OOP;

public class Cat {
    private String name;
    private String color;
    private int age;

    public Cat(){
    }

    public Cat(String name, String color, int age) {    // <- сегнатура
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    String voice() {         // метод заставляет кота мяукать, метод возвращает "звук"
        return "meow";
    }

    @Override
    public String toString() {
        return "Cat: " +
                "name = " + name +
                ", color = " + color +
                ", age = " + age
                ;
    }
}
