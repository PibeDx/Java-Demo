package com.company.inject_dependence.mapper;

import com.company.inject_dependence.ActivittyDetailEmployee;
import com.company.inject_dependence.Activity;
import com.company.inject_dependence.ActivityDetail;
import com.company.inject_dependence.Employee;
import com.company.inject_dependence.entity.ActivittyDetailEmployeeEntity;
import com.company.inject_dependence.entity.ActivityEntity;

/**
 * Created by iPibeDx on 27/11/16.
 */
public class ActivityDetailEmployeeMapper implements Mapper<ActivittyDetailEmployee, ActivittyDetailEmployeeEntity> {
    EmployeeMapper employeeMapper;
    ActivityDetailtMapper activityDetailtMapper;

    public ActivityDetailEmployeeMapper() {
    }

    public ActivityDetailEmployeeMapper(EmployeeMapper employeeMapper, ActivityDetailtMapper activityDetailtMapper) {
        this.employeeMapper = employeeMapper;
        this.activityDetailtMapper = activityDetailtMapper;
    }

    public void setEmployeeMapper(EmployeeMapper employeeMapper) {
        if (employeeMapper == null) throw new NullPointerException("employeeMapper is null");
        this.employeeMapper = employeeMapper;
    }

    public void setActivityDetailtMapper(ActivityDetailtMapper activityDetailtMapper) {
        if (activityDetailtMapper == null) throw new NullPointerException("activityDetailtMapper is null");
        this.activityDetailtMapper = activityDetailtMapper;
    }

    private void valNull() {
        if (employeeMapper == null) throw new NullPointerException("employeeMapper is null");
        if (activityDetailtMapper == null) throw new NullPointerException("activityDetailtMapper is null");
    }

    @Override
    public ActivittyDetailEmployee tranform(ActivittyDetailEmployeeEntity activittyDetailEmployeeEntity) {
        if (activittyDetailEmployeeEntity == null) return null;

        ActivittyDetailEmployee activittyDetailEmployee = new ActivittyDetailEmployee();
        activittyDetailEmployee.setIdActivityDetailtEmployee(activittyDetailEmployeeEntity.getIdActivityDetailtEmployee());
        activittyDetailEmployee.setName(activittyDetailEmployeeEntity.getName());
        return activittyDetailEmployee;
    }

    @Override
    public ActivittyDetailEmployee tranform(ActivittyDetailEmployee activittyDetailEmployee, ActivittyDetailEmployeeEntity activittyDetailEmployeeEntity) {
        if (activittyDetailEmployeeEntity == null) return null;
        valNull();

        activittyDetailEmployee.setIdActivityDetailtEmployee(activittyDetailEmployeeEntity.getIdActivityDetailtEmployee());
        activittyDetailEmployee.setName(activittyDetailEmployeeEntity.getName());

        if (activittyDetailEmployee.getEmployee() == null) activittyDetailEmployee.setEmployee(employeeMapper
                .tranform(new Employee(activittyDetailEmployee), activittyDetailEmployeeEntity.getEmployee()));

        if (activittyDetailEmployee.getActivityDetail() == null) activittyDetailEmployee.setActivityDetail(activityDetailtMapper
                .tranform(new ActivityDetail(activittyDetailEmployee), activittyDetailEmployeeEntity.getActivityDetail()));

        return activittyDetailEmployee;
    }
}
