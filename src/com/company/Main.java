package com.company;

import com.company.inject_dependence.ActivittyDetailEmployee;
import com.company.inject_dependence.Activity;
import com.company.inject_dependence.ActivityDetail;
import com.company.inject_dependence.Employee;

public class Main {

    public static void main(String[] args) {

        Activity activity = new Activity();
        activity.setIdActivity(1);
        activity.setName("activity 1");
        ActivityDetail activityDetail = new ActivityDetail();
        activityDetail.setIdActivityDetailt(1);
        activityDetail.setName("activityDetail 1");
        activityDetail.setActivity(activity);


        Employee employee = new Employee();
        employee.setIdEmployee(1);
        employee.setName("employee 1");

        ActivittyDetailEmployee activittyDetailEmployee = new ActivittyDetailEmployee();
        employee.setActivittyDetailEmployeeList(activittyDetailEmployee);
        activityDetail.setActivittyDetailEmployeeList(activittyDetailEmployee);
        activittyDetailEmployee.setIdActivityDetailtEmployee(1);
        activittyDetailEmployee.setName("activittyDetailEmployee 1");
        activittyDetailEmployee.setEmployee(employee);
        activittyDetailEmployee.setActivityDetail(activityDetail);








    }
}
