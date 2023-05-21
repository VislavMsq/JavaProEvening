package lesson4andHw4;

public class Cat {
    private final int appetite;
    private boolean fullness;

    public Cat(int appetite) {
        this.appetite = appetite;
        this.fullness = false;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite && !fullness) {
            plate.decreaseFood(appetite);
            fullness = true;
            System.out.println("Cat ate " + appetite + " food.");
        } else {
            System.out.println("Cat is not hungry or there is not enough food in the plate.");
        }
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isFull() {
        return fullness;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "appetite=" + appetite +
                ", fullness=" + fullness +
                '}';
    }
}
