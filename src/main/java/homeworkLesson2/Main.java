package homeworkLesson2;

public class Main {
    public static void main(String[] args) {

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Mikhail Mudrik",
                Position.MIDFIELDER,
                "mudrik@gmail.com",
                953085445,
                65000,
                22);
        empArray[1] = new Employee("Alexander Zinchenko",
                Position.MIDFIELDER,
                "zinchenko@gmail.com",
                993084567,
                88000,
                26);
        empArray[2] = new Employee("Victor Tsygankov",
                Position.ATTACK,
                "tsygankov@gmail.com",
                953085005,
                55000,
                25);
        empArray[3] = new Employee("Andrey Shevchenko",
                Position.TRAINER,
                "sheva@gmail.com",
                954085445,
                120000,
                46);
        empArray[4] = new Employee("Vitaly Mikolenko",
                Position.DEFENDER,
                "mikolenko@gmail.com",
                953775445,
                48000,
                23);
        // метод for each - если нам не нужна работа с индексами массива, если просто перечисление
        for (int i = 0; i < empArray.length; i++) {     // for( Employee employee : employees)
            if (empArray[i].getAge() > 40){             // if (empArray[i].getAge() > 40){
                System.out.println(empArray[i]);        // System.out.println(employee);
            }
        }
    }
}
