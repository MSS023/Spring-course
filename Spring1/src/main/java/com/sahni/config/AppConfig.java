package com.sahni.config;

import com.sahni.Alien;
import com.sahni.Computer;
import com.sahni.Desktop;
import com.sahni.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.sahni")
public class AppConfig {
//    @Bean(name={"com2", "desktop", "beast"})
////    @Scope(value = "prototype")
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean
//    public Alien alien(Computer com) {
//        Alien obj = new Alien();
//        obj.setAge(21);
//        obj.setCom(com);
//        return obj;
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop() {
//        return new Laptop();
//    }
}
