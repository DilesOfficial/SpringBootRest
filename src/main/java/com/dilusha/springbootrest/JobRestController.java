package com.dilusha.springbootrest;

import com.dilusha.springbootrest.model.JobPost;
import com.dilusha.springbootrest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class JobRestController {

    @Autowired
    private JobService jobService;

    @GetMapping("jobPosts")
    @ResponseBody
    public List<JobPost> getAllJobs() {
        return jobService.getAllJobs();
    }
}
