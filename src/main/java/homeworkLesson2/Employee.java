package homeworkLesson2;

public class Employee {
    private String firstNameAndLastName;
    private String jobTitle;
    private String email;
    private int telephone;
    private int salary;
    private int age;

    public String getFirstNameAndLastName() {
        return firstNameAndLastName;
    }

    public void setFirstNameAndLastName(String firstNameAndLastName) {
        this.firstNameAndLastName = firstNameAndLastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String firstNameAndLastName, String jobTitle, String email, int telephone, int salary, int age) {
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
