package com.company;

import com.company.inject_dependence.ActivittyDetailEmployee;
import com.company.inject_dependence.Activity;
import com.company.inject_dependence.ActivityDetail;
import com.company.inject_dependence.Employee;
import com.company.inject_dependence.entity.ActivittyDetailEmployeeEntity;
import com.company.inject_dependence.entity.ActivityDetailEntity;
import com.company.inject_dependence.entity.ActivityEntity;
import com.company.inject_dependence.entity.EmployeeEntity;
import com.company.inject_dependence.mapper.ActivityDetailEmployeeMapper;
import com.company.inject_dependence.mapper.ActivityDetailtMapper;
import com.company.inject_dependence.mapper.ActivityMapper;
import com.company.inject_dependence.mapper.EmployeeMapper;

public class MainDamo {

    public static void main(String[] args) {

        ActivityEntity activity = new ActivityEntity();
        activity.setIdActivity(1);
        activity.setName("activity 1");
        ActivityDetailEntity activityDetail = new ActivityDetailEntity();
        activityDetail.setIdActivityDetailt(1);
        activityDetail.setName("activityDetail 1");
        activityDetail.setActivity(activity);


        EmployeeEntity employee = new EmployeeEntity();
        employee.setIdEmployee(1);
        employee.setName("employee 1");

        ActivittyDetailEmployeeEntity activittyDetailEmployee = new ActivittyDetailEmployeeEntity();
        employee.setActivittyDetailEmployeeList(activittyDetailEmployee);
        activityDetail.setActivittyDetailEmployeeList(activittyDetailEmployee);
        activittyDetailEmployee.setIdActivityDetailtEmployee(1);
        activittyDetailEmployee.setName("activittyDetailEmployee 1");
        activittyDetailEmployee.setEmployee(employee);
        activittyDetailEmployee.setActivityDetail(activityDetail);


        initMapper(activittyDetailEmployee);
    }


    private static void initMapper(ActivittyDetailEmployeeEntity activittyDetailEmployeeEntity){
        ActivityDetailEmployeeMapper activityDetailEmployeeMapper = new ActivityDetailEmployeeMapper();
        ActivityMapper activityMapper = new ActivityMapper();
        ActivityDetailtMapper activityDetailtMapper = new ActivityDetailtMapper(activityMapper, activityDetailEmployeeMapper);
        EmployeeMapper employeeMapper = new EmployeeMapper(activityDetailEmployeeMapper);


        activityDetailEmployeeMapper.setActivityDetailtMapper(activityDetailtMapper);
        activityDetailEmployeeMapper.setEmployeeMapper(employeeMapper);

        ActivittyDetailEmployee activittyDetailEmployee = activityDetailEmployeeMapper.tranform(new ActivittyDetailEmployee(), activittyDetailEmployeeEntity);



    }
}
