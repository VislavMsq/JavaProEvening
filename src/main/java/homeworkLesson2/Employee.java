package homeworkLesson2;

public class Employee {
    private String firstNameAndLastName;
    private Position jobTitle;  // тип нашего поля класса
    private String email;
    private int telephone;
    private int salary;
    private int age;


    public int getAge() {
        return age;
    }

    public Employee(String firstNameAndLastName, Position jobTitle, String email, int telephone, int salary, int age) {
        this.firstNameAndLastName = firstNameAndLastName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "firstNameAndLastName = " + firstNameAndLastName +
                ", jobTitle = " + jobTitle +
                ", email = " + email +
                ", telephone = " + telephone +
                ", salary = " + salary +
                ", age = " + age
                ;
    }
}
