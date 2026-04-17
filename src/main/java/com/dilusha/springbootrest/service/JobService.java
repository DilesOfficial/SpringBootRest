package com.dilusha.springbootrest.service;

import com.dilusha.springbootrest.model.JobPost;
import com.dilusha.springbootrest.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository repository;

    public void addJob(JobPost jobPost) {
        repository.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return repository.getAllJobs();
    }

    public JobPost getJob(int postId) {
        return repository.getJob(postId);
    }
}
