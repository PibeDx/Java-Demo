package com.company.inject_dependence.entity;

/**
 * Created by iPibeDx on 27/11/16.
 */
public class ActivityDetailEntity {
    int idActivityDetailt;
    String name;
    ActivityEntity activity;
    ActivittyDetailEmployeeEntity activittyDetailEmployeeList;


    public int getIdActivityDetailt() {
        return idActivityDetailt;
    }

    public void setIdActivityDetailt(int idActivityDetailt) {
        this.idActivityDetailt = idActivityDetailt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActivityEntity getActivity() {
        return activity;
    }

    public void setActivity(ActivityEntity activity) {
        this.activity = activity;
    }

    public ActivittyDetailEmployeeEntity getActivittyDetailEmployeeList() {
        return activittyDetailEmployeeList;
    }

    public void setActivittyDetailEmployeeList(ActivittyDetailEmployeeEntity activittyDetailEmployeeList) {
        this.activittyDetailEmployeeList = activittyDetailEmployeeList;
    }
}
