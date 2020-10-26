package com.docker.qmmall.service;

import com.docker.qmmall.model.Activity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by CHEN on 2020/10/26.
 */
public interface ActivityService {
    public Integer addActivity(String activityname, Integer activitystate, String activitypic, Date activitystarttime,
                               Date activityendtime, Integer productid, Integer activetytype);

    public Integer updateActivity(String activityname, Integer activitystate, String activitypic, Date activitystarttime,
                                 Date activityendtime, Integer productid, Integer activetytype);

    public Integer deleteActivity(Integer activityid);

    public Map<String,Object> getActivity();
}
