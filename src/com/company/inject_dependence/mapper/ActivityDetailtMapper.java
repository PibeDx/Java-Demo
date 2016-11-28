package com.company.inject_dependence.mapper;

import com.company.inject_dependence.ActivittyDetailEmployee;
import com.company.inject_dependence.Activity;
import com.company.inject_dependence.ActivityDetail;
import com.company.inject_dependence.entity.ActivityDetailEntity;

/**
 * Created by iPibeDx on 27/11/16.
 */
public class ActivityDetailtMapper extends MapperBase<ActivityDetail, ActivityDetailEntity> {

    final ActivityMapper activityMapper;
    final ActivityDetailEmployeeMapper activityDetailEmployeeMapper;

    public ActivityDetailtMapper(ActivityMapper activityMapper, ActivityDetailEmployeeMapper activityDetailEmployeeMapper) {
        this.activityMapper = activityMapper;
        this.activityDetailEmployeeMapper = activityDetailEmployeeMapper;
    }

    @Override
    public ActivityDetail tranform(ActivityDetailEntity activityDetailEntity) {
        ActivityDetail activityDetail = new ActivityDetail();
        activityDetail.setIdActivityDetailt(activityDetailEntity.getIdActivityDetailt());
        activityDetail.setName(activityDetailEntity.getName());
        return activityDetail;
    }

    @Override
    public ActivityDetail tranform(ActivityDetail activityDetail, ActivityDetailEntity activityDetailEntity) {
        if (activityDetailEntity == null) return null;
        if (activityDetail == null) throw new NullPointerException("activityDetail is null");

        activityDetail.setIdActivityDetailt(activityDetailEntity.getIdActivityDetailt());
        activityDetail.setName(activityDetailEntity.getName());

        if(activityDetail.getActivity()==null)
            activityDetail.setActivity(activityMapper
                    .tranform(new Activity(), activityDetailEntity.getActivity()));

        if (activityDetail.getActivittyDetailEmployeeList()==null)
            activityDetail.setActivittyDetailEmployeeList(activityDetailEmployeeMapper
                    .tranform(new ActivittyDetailEmployee(), activityDetailEntity.getActivittyDetailEmployeeList()));

        return activityDetail;
    }
}
