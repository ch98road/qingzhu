package com.docker.qmmall.mapper;

import com.docker.qmmall.model.Activity;

import java.util.LinkedList;

/**
 * Created by CHEN on 2020/10/23.
 */
public interface ActivityMapper {
    Integer addActivity(Activity activity);
    Integer updateActivity(Activity activity);
    Integer deleteActivity(Activity activity);
    LinkedList<Activity> getActivity(Activity activity);
}
