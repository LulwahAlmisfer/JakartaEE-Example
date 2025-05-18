package org.example.jakartaeeexample.Services;
import jakarta.enterprise.context.Dependent;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.example.jakartaeeexample.Entities.Todo;

import java.util.List;


@Dependent
@Transactional
public class TodoService {

    @PersistenceContext(unitName = "TodoPU")
    private EntityManager em;

    public List<Todo> getAll() {
        return em.createQuery("SELECT t FROM Todo t", Todo.class).getResultList();
    }

    public void add(Todo todo) {
        em.persist(todo);
    }
}
