package com.docker.qmmall.service.Impl;

import com.docker.qmmall.mapper.ActivityMapper;
import com.docker.qmmall.model.Activity;
import com.docker.qmmall.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by CHEN on 2020/10/26.
 */
@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    ActivityMapper activityMapper;


    @Override
    public Integer addActivity(String activityname, Integer activitystate, String activitypic, Date activitystarttime,
                               Date activityendtime, Integer productid, Integer activetytype) {

        Activity activity = new Activity(null, activityname, activitystate, activitypic, activitystarttime,
                activityendtime, productid, activetytype);



        return activityMapper.addActivity(activity);
    }

    @Override
    public Integer updateActivity(String activityname, Integer activitystate, String activitypic, Date activitystarttime,
                                 Date activityendtime, Integer productid, Integer activetytype) {
        Activity activity = new Activity(null, activityname, activitystate, activitypic, activitystarttime,
                activityendtime, productid, activetytype);
        return activityMapper.updateActivity(activity);
    }

    @Override
    public Integer deleteActivity(Integer activityid) {

        Activity activity = new Activity();
        activity.setActivityid(activityid);
        return activityMapper.deleteActivity(activity);
    }

    @Override
    public Map<String,Object> getActivity() {
        Map<String,Object> res = new HashMap<>();
        res.put("res",100);
        Map<String,Object> data = new HashMap<>();

        int type=0;
        LinkedList<Activity> tmp = new LinkedList<>();
        for (Activity a:activityMapper.getActivity(new Activity())
             ) {
            if (a.getActivetytype()!=type&&type>0){
                data.put("type-"+Integer.toString(type),tmp);
                type = a.getActivetytype();
                tmp = new LinkedList<>();
            }else if(a.getActivetytype()!=type&&type==0){
                type = a.getActivetytype();
            }
            tmp.push(a);
        }
        data.put("type-"+Integer.toString(type),tmp);
        res.put("data",data);
        return res;
    }
}
