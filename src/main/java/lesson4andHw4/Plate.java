package lesson4andHw4;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public int getFood() {
        return food;
    }

    public void decreaseFood(int food) {
        if (this.food >= food) {    // проверяем хватает ли еды в тарелке
            this.food -= food;  //this.food -= this.food -food;
            System.out.println("Food decreased  by " + food + ". Current amound of food: " + food + ".");
        } else {
            System.out.println("There is not  enough  food in the plate.");
        }
    }
    public void addFood(int food){
        this.food += food;
        System.out.println("Food added to the plate. Current amount of food: " + food + ".");
    }

    // метод add food

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
