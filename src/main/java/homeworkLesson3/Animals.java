package homeworkLesson3;

public class Animals {

    //field class
    protected String name;
    protected int swimLimit;
    protected int runLimit;

    // constructor
    public Animals(String name, int swimLimit, int runLimit) {
        this.name = name;
        this.swimLimit = swimLimit;
        this.runLimit = runLimit;
    }

    /**
     * method to implement swimming
     * @param distance parameter that we set for the correct solution of the problem
     */
    public void swim(int distance){
        if (swimLimit == 0){        // condition check
            System.out.println("can't swim");
        } else if (swimLimit >= distance) {
            System.out.println(name + " swam the distance " + distance);
        }else {
            System.out.println(name + " could not swim the distance " + distance);
        }
    }

    /**
     * method to implement running
     * @param distance parameter that we set for the correct solution of the problem
     */
    public void run(int distance){
        if(runLimit >= distance){       // condition check
            System.out.println(name + " ran the distance " + distance);
        } else {
            System.out.println(name + " couldn't run the distance " + distance);
        }
    }
}
