package com.sahni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {
    @Value("21")
    private int age;
    private Computer com;

    public Alien() {
        System.out.println("Alien object created");
    }

//    @ConstructorProperties({"age", "lap"})
//    public Alien (int age, Computer lap) {
//        System.out.println("Para age, lap constructor called");
//        this.age = age;
//        this.lap = lap;
//    }

    public Computer getCom() {
        return com;
    }

    @Autowired
    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("Setter called");
        this.age = age;
    }

    public void code() {
        System.out.println("Coding");
        com.compile();
    }
}
