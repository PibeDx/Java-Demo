package com.company.inject_dependence;

import java.util.List;

/**
 * Created by iPibeDx on 27/11/16.
 */
public class Employee {
    int idEmployee;
    String name;

    ActivittyDetailEmployee activittyDetailEmployeeList;

    public Employee() {
    }

    public Employee(ActivittyDetailEmployee activittyDetailEmployeeList) {
        this.activittyDetailEmployeeList = activittyDetailEmployeeList;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActivittyDetailEmployee getActivittyDetailEmployeeList() {
        return activittyDetailEmployeeList;
    }

    public void setActivittyDetailEmployeeList(ActivittyDetailEmployee activittyDetailEmployeeList) {
        this.activittyDetailEmployeeList = activittyDetailEmployeeList;
    }
}
