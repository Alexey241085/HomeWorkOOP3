package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    private static Random random = new Random();

    static Employee generateEmployees(List<Employee> list) {
//        List <Employee> workFree = new ArrayList<>();
        int teamEmployee = 5;
        for (int i = 0; i < teamEmployee; i++) {
            int val = random.nextInt(2);
            switch (val) {
                case 0:
                    list.add(generateEmployee());
                    break;
                case 1:
                    list.add(generateFreeEmployee());
                    break;
            }
        }

        return null;
    }


    static Worker generateEmployee() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};

        int salary = random.nextInt(200, 300);
        int index = random.nextInt(30, 50);
        int age = random.nextInt(20, 63);

        return new Worker(names[random.nextInt(10)], surnames[random.nextInt(10)], age, salary * index);
    }

    static Freelancer generateFreeEmployee() {
        String[] name = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surname = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};

        int salary = random.nextInt(200, 300);
        int hour = random.nextInt(2, 7);
        int workDay = random.nextInt(10, 20);
        int age = random.nextInt(20, 63);
        salary = salary * hour * workDay;

        return new Freelancer(name[random.nextInt(10)], surname[random.nextInt(10)], age, salary);
    }


    public static void main(String[] args) {
        List<Employee> workFree = new ArrayList<>();

        generateEmployees(workFree);
       System.out.println("\n создать случайного сотрудника\n");
        for (Employee i : workFree) {
            System.out.println(i);
        }

        System.out.println("\n************************\n");


        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++)
            employees[i] = generateEmployee();

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\nфрилансеры\n");

        Employee[] employeesFree = new Employee[10];
        for (int i = 0; i < employeesFree.length; i++) {
            employeesFree[i] = generateFreeEmployee();
        }

        for (Employee employeeFree : employeesFree) {
            System.out.println(employeeFree);
        }
        Arrays.sort(employees, new AgeComporator());

        Arrays.sort(employees, new NameComparator());
        System.out.println("\n");
        Arrays.sort(employeesFree, new AgeComporator());
        Arrays.sort(employees);
        System.out.println("\n");
        Arrays.sort(employeesFree);

        Arrays.sort(employees, new SalaryComparator());

        System.out.printf("*** Отсортированный массив сотрудников ***\n\n");

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println();

        for (Employee employeeFrees : employeesFree) {
            System.out.println(employeeFrees);

        }
    }
}



