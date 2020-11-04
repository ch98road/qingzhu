package com.docker.qmmall.controller;

import com.docker.qmmall.model.Activity;
import com.docker.qmmall.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by CHEN on 2020/10/23.
 */
@RestController
@RequestMapping("/activity")
@CrossOrigin
public class ActivityController {


    @Autowired
    private ActivityService activityService;

    @PostMapping("/add")
    public Integer addActivity(@RequestParam("activityname") String activityname, @RequestParam("activitystate") Integer activitystate, @RequestParam("activitypic") String activitypic,
                               @RequestParam("activitystarttime") String activitystarttime, @RequestParam("activityendtime") String activityendtime, @RequestParam("productid") Integer productid,
                               @RequestParam("activetytype") Integer activetytype) {

        return activityService.addActivity(activityname, activitystate, activitypic, activitystarttime, activityendtime, productid, activetytype);
    }
    @PostMapping("/update")
    public Integer updateActivity(@RequestParam("activityname") String activityname, @RequestParam("activitystate") Integer activitystate, @RequestParam("activitypic") String activitypic,
                                  @RequestParam("activitystarttime") String activitystarttime, @RequestParam("activityendtime") String activityendtime, @RequestParam("productid") Integer productid,
                                  @RequestParam("activetytype") Integer activetytype) {
        return activityService.updateActivity(activityname, activitystate, activitypic, activitystarttime, activityendtime, productid, activetytype);
    }

    @PostMapping("/delete")
    public Integer deleteActivity(@RequestParam("activityid") Integer activityid) {
        return activityService.deleteActivity(activityid);
    }

    @PostMapping("/get")
    public Map<String,Object> getActivity() {
        return activityService.getActivity();
    }

}
