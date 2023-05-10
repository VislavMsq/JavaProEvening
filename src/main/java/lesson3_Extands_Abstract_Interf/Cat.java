package lesson3_Extands_Abstract_Interf;

public class Cat extends Animal{
    public Cat(String name, String color, int age) {

        super(name, color, age);
    }
    @Override
    public String voice(){
        return "meow";
    }
}
