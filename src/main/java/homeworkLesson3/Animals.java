package homeworkLesson3;

abstract public class Animals implements Action{
    protected int runLimit;
    protected int swimLimit;
    protected String className;
    private static int countOfAnimals;

    static {
        countOfAnimals = 0;
    }

    public Animals(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.className = getClass().getSimpleName();
        countOfAnimals++;
    }

    public String getClassName() {
        return className;
    }

    public static int getCountOfAnimals() {
        return countOfAnimals;
    }

    public String run(int distance) {
        if (distance > swimLimit) {
            return className + " couldn't swim " + distance;
        } else {
            return className + " successfully swim " + distance;
        }
    }

    public String swim(int distance) {
        if (distance > swimLimit){
            return className + " couldn't swim " + distance;
        } else {
            return className + " successfully swim " + distance;
        }
    }

    @Override
    public String toString() {
        return className + ". run limit: " + runLimit + ". swim limit" + swimLimit;
    }
}
