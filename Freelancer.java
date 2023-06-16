package org.example;
import java.util.Random;
public class Freelancer extends Employee{

    private Random random = new Random();



    public Freelancer(String name, String surName, int age, double salary) {
        super(name, surName, age, salary);

    }

    @Override
    public double calculateSalary() {
        return salary;

    }

    @Override
    public int ageComp() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d; Фрилансер; Среднемесячная заработная плата (почасовая оплата оплата): %.2f (руб.)", name, surName, age, salary);
        }
    }

