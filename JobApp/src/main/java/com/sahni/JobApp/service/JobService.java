package com.sahni.JobApp.service;

import com.sahni.JobApp.model.JobPost;
import com.sahni.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    JobRepo repo;

    public void addJob(JobPost job){
        repo.addJobs(job);
    }

    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();
    }
}
