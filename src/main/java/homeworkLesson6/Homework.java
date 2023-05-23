package homeworkLesson6;

import java.lang.reflect.Array;

public class Homework {
    public static void main(String[] args) {
        Implementation implementation = new Implementation();
        implementation.add(22,0);
        implementation.add(29,1);
        implementation.add(12,2);
        implementation.add(34,3);
        implementation.add(99,4);
        implementation.add(33,5);
        implementation.add(69,2);
        System.out.println(implementation);

        implementation.addAll(1,5,8);
        System.out.println(implementation);

        System.out.println(implementation.contains(29));
        System.out.println(implementation.contains(39));

        System.out.println(implementation.indexOf(99));
        System.out.println(implementation.indexOf(919));

    }
}
