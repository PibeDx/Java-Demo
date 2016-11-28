package com.company.inject_dependence;

/**
 * Created by iPibeDx on 27/11/16.
 */
public class ActivittyDetailEmployee {
    int idActivityDetailtEmployee;
    String name;

    ActivityDetail activityDetail;
    Employee employee;

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

    public ActivityDetail getActivityDetail() {
        return activityDetail;
    }

    public void setActivityDetail(ActivityDetail activityDetail) {
        this.activityDetail = activityDetail;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
