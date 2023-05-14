package homeworkLesson3;

public class Cat extends Animals {

    public Cat(int runlimit){
        super(runlimit, -1);
    }
    public String swim (int distance){
        return getClassName() + " can't swim";
    }
}
