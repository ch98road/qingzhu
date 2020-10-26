package com.docker.qmmall.controller;

import com.docker.qmmall.model.Activity;
import com.docker.qmmall.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by CHEN on 2020/10/23.
 */
@RestController
@RequestMapping("/activity")
public class ActivityController {


    @Autowired
    private ActivityService activityService;

    @PostMapping("/add")
    public Integer addActivity(@RequestParam("activityname") String activityname, @RequestParam("activitystate") Integer activitystate, @RequestParam("activitypic") String activitypic,
                               @RequestParam("activitystarttime") Date activitystarttime, @RequestParam("activityendtime") Date activityendtime, @RequestParam("productid") Integer productid,
                               @RequestParam("activetytype") Integer activetytype) {

        return activityService.addActivity(activityname, activitystate, activitypic, activitystarttime, activityendtime, productid, activetytype);
    }
    @PostMapping("/update")
    public Integer updateActivity(@RequestParam("activityname") String activityname, @RequestParam("activitystate") Integer activitystate, @RequestParam("activitypic") String activitypic,
                                  @RequestParam("activitystarttime") Date activitystarttime, @RequestParam("activityendtime") Date activityendtime, @RequestParam("productid") Integer productid,
                                  @RequestParam("activetytype") Integer activetytype) {
        return activityService.updateActivity(activityname, activitystate, activitypic, activitystarttime, activityendtime, productid, activetytype);

    }

    @PostMapping("/delete")
    public Integer deleteActivity(@RequestParam("activityid") Integer activityid) {
        return activityService.deleteActivity(activityid);
    }

    @PostMapping("/get")
    public LinkedList<Activity> getActivity(@RequestParam("activitystate") String activitystate, @RequestParam("activetytype") String activetytype) {
        return activityService.getActivity(activitystate,activetytype);
    }

}
