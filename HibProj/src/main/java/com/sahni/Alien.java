package com.sahni;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Alien {
    @Id
    int Aid;
    private String Aname;
    private String Atech;

    @Override
    public String toString() {
        return "Alien{" +
                "Aid=" + Aid +
                ", Aname='" + Aname + '\'' +
                ", Atech='" + Atech + '\'' +
                ", laptops=" + laptops +
                '}';
    }

    @OneToMany(fetch = FetchType.EAGER)
    private List<Laptop> laptops;

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    public int getAid() {
        return Aid;
    }

    public void setAid(int aid) {
        Aid = aid;
    }

    public String getAname() {
        return Aname;
    }

    public void setAname(String aname) {
        Aname = aname;
    }

    public String getAtech() {
        return Atech;
    }

    public void setAtech(String atech) {
        Atech = atech;
    }
}
