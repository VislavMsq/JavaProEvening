package lesson4andHw4;

/**
 * Homework lesson 4
 * Vladislav Mosiuk
 * 12.05.23
 */

public class Lesson4 {
    public static void main(String[] args) {
        Cat[] cats = {new Cat(10), new Cat(5), new Cat(15)};
        Plate plate = new Plate(25);

        for (Cat cat : cats){
            cat.eat(plate);
            System.out.println(cat);
        }
        // feed cat
//      plate.setFood(plate.getFood() - cat.getAppetite());
//      plate.decreaseFood(cat.getAppetite());
        plate.addFood(10);
        System.out.println(plate);
    }
}
