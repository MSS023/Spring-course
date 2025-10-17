package com.sahni.app.repo;

import com.sahni.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap) {
        System.out.println("Saved in Database...");
    }
}
