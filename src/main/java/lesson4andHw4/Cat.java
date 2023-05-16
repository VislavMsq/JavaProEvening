package lesson4andHw4;

public class Cat {
    private final int appetite;
    private boolean fullness;
    // сытый кот не есть

    public Cat(int appetite) {
        this.appetite = appetite;
        this.fullness = false;
    }

<<<<<<< HEAD
    public void eat(Plate plate) {
        if (plate.getFood() >= appetite && !fullness) {
            plate.decreaseFood(appetite);       // в аргумент класса передали обьект тарелки и вызвали обьект и всего методы в этом методе)
            fullness = true;                    // кот становится сытым
=======
    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite && !fullness) {
            plate.decreaseFood(appetite);       // в аргумент класса передали обьект тарелки и вызвали обьект и всего методы в этом методе)
            fullness = true;    // кот становится сытым
>>>>>>> 041d9753b4e49e3d96183085682477984f02cfbd
            System.out.println("Cat ate " + appetite + " food.");
        } else {
            System.out.println("Cat is not hungry or there is not enough food in the plate.");
        }
    }
    public boolean isFull(){
        return fullness;
    }
        @Override
        public String toString () {
            return "Cat{" +
                    "appetite=" + appetite +
                    ", fullness=" + fullness +
                    '}';
        }
    }
