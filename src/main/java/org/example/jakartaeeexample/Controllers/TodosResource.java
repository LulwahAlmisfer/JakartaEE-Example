package org.example.jakartaeeexample.Controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.jakartaeeexample.Entities.Todo;
import org.example.jakartaeeexample.Services.TodoService;

import java.util.List;

@Path("")
public class TodosResource {

    @Inject
    private TodoService todoService;

    @GET
    @Produces("application/json")
    public List<Todo> hello() {
        return todoService.getAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addTodo(Todo todo) {
        todoService.add(todo);
        return Response.status(Response.Status.CREATED).build();
    }
}