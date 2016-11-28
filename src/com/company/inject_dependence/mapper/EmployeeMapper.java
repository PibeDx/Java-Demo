package com.company.inject_dependence.mapper;

import com.company.MainDamo;
import com.company.inject_dependence.Employee;
import com.company.inject_dependence.entity.EmployeeEntity;

/**
 * Created by iPibeDx on 27/11/16.
 */
public class EmployeeMapper extends MapperBase<Employee, EmployeeEntity> {

    final ActivityDetailEmployeeMapper activityDetailEmployeeMapper;

    public EmployeeMapper(ActivityDetailEmployeeMapper activityDetailEmployeeMapper) {
        this.activityDetailEmployeeMapper = activityDetailEmployeeMapper;
    }



    @Override
    public Employee tranform(EmployeeEntity employeeEntity) {
        if (employeeEntity == null) return null;
        Employee employee = new Employee();
        employee.setIdEmployee(employeeEntity.getIdEmployee());
        employee.setName(employeeEntity.getName());
        return employee;
    }

    @Override
    public Employee tranform(Employee employee, EmployeeEntity employeeEntity) {
        if (employeeEntity == null) return null;
        if (employee == null) throw new NullPointerException("employee is null");

        employee.setIdEmployee(employeeEntity.getIdEmployee());
        employee.setName(employeeEntity.getName());
        if (employee.getActivittyDetailEmployeeList() == null)
        employee.setActivittyDetailEmployeeList(activityDetailEmployeeMapper
                .tranform(employee.getActivittyDetailEmployeeList(), employeeEntity.getActivittyDetailEmployeeList()));
        return employee;
    }
}
