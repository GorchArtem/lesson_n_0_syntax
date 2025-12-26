package lesson_arrays.company_and_employees;

public class SomeCompany {
    String name;
    Employee[] employees;
    int counter = 0;

    public SomeCompany(String name) {
        this.name = name;
    }

    public void addEmployee(String name, String surname, int rate) {
        // смотрим на текущий размер массива
        //проверяем счетчик, что его число не достигло/превысило потолка массива
        //если это так - то выполняем операция добавления нового объекта в массива

        if (counter < employees.length) {
            System.out.println("счетчик counter = " + counter);
            employees[counter] = new Employee(name, surname, rate);
            counter++;
            System.out.println("Добавлен новый объект сотрудника и counter = " + counter);
        }

    }
}
