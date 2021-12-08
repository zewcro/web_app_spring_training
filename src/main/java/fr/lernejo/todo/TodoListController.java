package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class TodoListController {
    @PostMapping("/api/todo")
    public void addTodo(@RequestBody Todo todo) {
        // todos.save(todo);
    }

    @GetMapping("/api/todo")
    public void /*TodoRepository*/ getTodos(){
        // return todos;
    }
}