package com.company.inject_dependence.mapper;

import com.company.inject_dependence.Activity;
import com.company.inject_dependence.entity.ActivityEntity;

/**
 * Created by iPibeDx on 27/11/16.
 */
public class ActivityMapper extends MapperBase<Activity, ActivityEntity> {

    @Override
    public Activity tranform(ActivityEntity activityEntity) {
        if (activityEntity == null) return null;
        Activity activity = new Activity();
        activity.setIdActivity(activityEntity.getIdActivity());
        activity.setName(activityEntity.getName());
        return activity;
    }

    @Override
    public Activity tranform(Activity activity, ActivityEntity activityEntity) {
        if (activityEntity == null) return null;
        if (activity == null) throw new NullPointerException("activity is null");

        activity.setIdActivity(activityEntity.getIdActivity());
        activity.setName(activityEntity.getName());
        return activity;
    }
}
