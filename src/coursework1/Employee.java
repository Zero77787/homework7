package coursework1;

import java.util.Objects;

public class Employee {
    private int ID;
    private String surNameNameMidlName;
    private int departamentEmployee;
    private int selaryEmployee;
    public static int count;


    @Override
    public String toString() {
        return   "ID: " + ID + ", ФИО: " + surNameNameMidlName + ", Отдел: " + departamentEmployee +" ,Зарплата: " + selaryEmployee + " рублей.";
    }

    public Employee( String surNameNameMidlName, int departamentEmployee, int selaryEmployee) {
        this.ID = ++count;
        this.surNameNameMidlName= surNameNameMidlName;
        this.departamentEmployee = departamentEmployee;
        this.selaryEmployee = selaryEmployee;


        }


    public int getID() {
        return ID;
    }

    public static int getCount() {
        return count;
    }

    public String getSurNameNameMidlName() {
        return surNameNameMidlName;
    }


    public int getDepartamentEmployee() {
        return departamentEmployee;
    }

    public int getSelaryEmployee() {
        return selaryEmployee;
    }

    public void setDepartamentEmployee(int departamentEmployee) {
        this.departamentEmployee = departamentEmployee;
    }

    public void setSelaryEmployee(int selaryEmployee) {
        this.selaryEmployee = selaryEmployee;
    }

    }

