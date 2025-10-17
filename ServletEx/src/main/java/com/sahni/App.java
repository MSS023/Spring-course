package com.sahni;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        try {
            Context context = tomcat.addContext("",null);
            Tomcat.addServlet(context, "HelloServlet", new HelloServlet());
            context.addServletMappingDecoded("/hello", "HelloServlet");

            tomcat.start();
            tomcat.getServer().await();
        } catch (LifecycleException e) {
            throw new RuntimeException(e);
        }
    }
}
