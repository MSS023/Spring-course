package com.sahni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Main {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.sahni.Laptop.class)
                .configure()
                .buildSessionFactory();                    // cfg.buildSessionFactory();
        Session session = sf.openSession();

        Laptop laptop = session.getReference(Laptop.class, 1);

        System.out.println(laptop);

        session.close();

        Session session2 = sf.openSession();

        Laptop laptop2 = session2.getReference(Laptop.class, 1);

        System.out.println(laptop2);

        session2.close();
        sf.close();

    }
}