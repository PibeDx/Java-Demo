package com.company.inject_dependence.entity;

/**
 * Created by iPibeDx on 27/11/16.
 */
public class ActivittyDetailEmployeeEntity {
    int idActivityDetailtEmployee;
    String name;

    ActivityDetailEntity activityDetail;
    EmployeeEntity employee;

    public int getIdActivityDetailtEmployee() {
        return idActivityDetailtEmployee;
    }

    public void setIdActivityDetailtEmployee(int idActivityDetailtEmployee) {
        this.idActivityDetailtEmployee = idActivityDetailtEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActivityDetailEntity getActivityDetail() {
        return activityDetail;
    }

    public void setActivityDetail(ActivityDetailEntity activityDetail) {
        this.activityDetail = activityDetail;
    }

    public EmployeeEntity getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeEntity employee) {
        this.employee = employee;
    }
}
