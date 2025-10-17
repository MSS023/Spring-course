package com.sahni.spring_boot_rest.service;

import com.sahni.spring_boot_rest.model.JobPost;
import com.sahni.spring_boot_rest.repo.JobRepo;
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

    public JobPost getJob(int postId) {
        return repo.getJob(postId);
    }

    public void updateJob(JobPost job) {
        repo.updateJob(job);
    }

    public void deleteJob(int postId) {
        repo.deleteJob(postId);
    }
}
