package lesson_arrays.company_and_employees;

public class CompanyTestMain {
    public static void main(String[] args) {

        //первый вариант добавления сотрудников в компанию - через явной вызов ячеек массива employees
        SomeCompany company1 = new SomeCompany("BMW");
        company1.employees = new Employee[4];

        company1.employees[0] = new Employee("John", "Doe", 30);
        company1.employees[1] = new Employee("Jane", "Doe", 30);
        company1.employees[2] = new Employee("John", "Doe", 30);
        company1.employees[3] = new Employee("Jane", "Doe", 30);


        for (int i = 0; i < company1.employees.length; i++) {
            System.out.println(company1.employees[i].toString());
        }


        //второй вариант добавления сотрудников через метод addEmployee()

        SomeCompany company2 = new SomeCompany("Audi");
        company2.employees = new Employee[5];

        company2.addEmployee("Name", "Surname", 0);
        company2.addEmployee("Name1", "Surname1", 0);
        company2.addEmployee("Name2", "Surname2", 0);
        company2.addEmployee("Name3", "Surname3", 0);
        company2.addEmployee("Name4", "Surname4", 0);
        company2.addEmployee("Name4", "Surname4", 0);

        for (int i = 0; i < company2.employees.length; i++) {
            System.out.println(company2.employees[i].toString());
        }




//        int countOfEmployees = Integer.parseInt(input.nextLine());
//
//        for (int i = 0; i < countOfEmployees; i++) {
//            company2.addEmployee(input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine()));
//        }

    }
}
