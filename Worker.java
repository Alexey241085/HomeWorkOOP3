package org.example;


public class Worker extends Employee {

    public Worker(String name, String surName, int age, double salary) {
        super(name, surName, age, salary);

    }

    @Override
    public double calculateSalary() {
        return salary;
        //TODO: Для фрилансера - return 20 * 5 * salary
    }

    @Override
    public int ageComp() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d; Рабочий; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)", name, surName, age, salary);
    }



}
