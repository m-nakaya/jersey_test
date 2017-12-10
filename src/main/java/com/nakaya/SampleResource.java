package com.nakaya;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/sample")
public class SampleResource {

    // mvn clean package tomcat7:run
    
    @GET
    public String hello() {
        return "Hello";
    }
}