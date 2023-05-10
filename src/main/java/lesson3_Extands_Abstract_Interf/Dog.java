package lesson3_Extands_Abstract_Interf;

public class  Dog extends Animal{

    public Dog(String name, String color, int age) {

        super(name, color, age);
    }
    @Override
    public String voice(){
        return "gaf-gaf";
    }
}
