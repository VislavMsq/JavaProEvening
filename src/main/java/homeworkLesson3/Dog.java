package homeworkLesson3;

public class Dog extends Animals {

    /**
     * method for the cat
     * @param name through super access the fields of the parent
     */
    public Dog(String name) {
        super(name, 10, 500);
        increaseDogCount();
    }


}



