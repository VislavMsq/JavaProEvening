package homeworkLesson2;

public class Main {
    public static void main(String[] args) {

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Mikhail Mudrik",
                "midfielder",
                "mudrik@gmail.com",
                953085445,
                65000,
                22);
        empArray[1] = new Employee("Alexander Zinchenko",
                "midfielder",
                "zinchenko@gmail.com",
                993084567,
                88000,
                26);
        empArray[2] = new Employee("Victor Tsygankov",
                "attack",
                "tsygankov@gmail.com",
                953085005,
                55000,
                25);
        empArray[3] = new Employee("Andrey Shevchenko",
                "trainer",
                "sheva@gmail.com",
                954085445,
                120000,
                46);
        empArray[4] = new Employee("Vitaly Mikolenko",
                "defender",
                "mikolenko@gmail.com",
                953775445,
                48000,
                23);

        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() > 40){
                System.out.println(empArray[i]);
            }
        }

    }
}
