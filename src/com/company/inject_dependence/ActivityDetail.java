package com.company.inject_dependence;

import java.util.List;

/**
 * Created by iPibeDx on 27/11/16.
 */
public class ActivityDetail {
    int idActivityDetailt;
    String name;
    Activity activity;
    ActivittyDetailEmployee activittyDetailEmployeeList;

    public ActivityDetail() {
    }

    public ActivityDetail(ActivittyDetailEmployee activittyDetailEmployeeList) {
        this.activittyDetailEmployeeList = activittyDetailEmployeeList;
    }

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

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public ActivittyDetailEmployee getActivittyDetailEmployeeList() {
        return activittyDetailEmployeeList;
    }

    public void setActivittyDetailEmployeeList(ActivittyDetailEmployee activittyDetailEmployeeList) {
        this.activittyDetailEmployeeList = activittyDetailEmployeeList;
    }
}
