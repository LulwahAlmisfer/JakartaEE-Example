package org.example.jakartaeeexample;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import org.example.jakartaeeexample.Services.TodoService;

@Path("/hello-world")
public class HelloResource {


    @Inject
    private TodoService todoService;

    @GET
    @Produces("text/plain")
    public String hello() {
        return todoService.getAll().toString() ;
    }
}