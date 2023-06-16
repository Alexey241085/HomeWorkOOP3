package org.example;

public abstract class Employee implements Comparable<Employee> {
    protected String name;
    protected String surName;
    protected double salary;
    protected  int age;

    public Employee(String name, String surName, int age, double salary) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    public abstract  double calculateSalary();

    public abstract int ageComp();

    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s; Среднемесячная заработная плата: %.2f", name, surName, salary);
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare( o.calculateSalary(), calculateSalary());
    }
}
