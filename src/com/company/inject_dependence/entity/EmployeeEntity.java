package com.company.inject_dependence.entity;

/**
 * Created by iPibeDx on 27/11/16.
 */
public class EmployeeEntity {
    int idEmployee;
    String name;

    ActivittyDetailEmployeeEntity activittyDetailEmployeeList;

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

    public ActivittyDetailEmployeeEntity getActivittyDetailEmployeeList() {
        return activittyDetailEmployeeList;
    }

    public void setActivittyDetailEmployeeList(ActivittyDetailEmployeeEntity activittyDetailEmployeeList) {
        this.activittyDetailEmployeeList = activittyDetailEmployeeList;
    }
}
