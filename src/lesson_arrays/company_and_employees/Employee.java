package lesson_arrays.company_and_employees;

public class Employee {
    String name;
    String surname;
    int rate;


    public Employee(String name, String surname, int rate) {
        this.name = name;
        this.surname = surname;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", rate=" + rate +
                '}';
    }
}
