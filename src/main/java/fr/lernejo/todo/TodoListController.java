package fr.lernejo.todo;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodoListController {
    ArrayList<Todo> ListToDo = new ArrayList<>();
    @GetMapping(value="/api/todo")
    public ArrayList<Todo> getList(){
        return ListToDo;
    }
    @PostMapping(value = "/api/todo")
    public void add(@RequestBody Todo todo){
        ListToDo.add(todo);
    }

}