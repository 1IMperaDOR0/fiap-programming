package br.com.fiap.CrudSpring.controller;

import br.com.fiap.CrudSpring.model.Todo;
import br.com.fiap.CrudSpring.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo", produces = "application/json")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;   // injeção de dependência de novo
    }

    // GET /todo
    @GetMapping
    public List<Todo> getAll() {
        return this.todoService.findAll();
    }

    // GET /todo/1  -> o {id} da URL vira o parâmetro idTodo
    @GetMapping("/{id}")
    public ResponseEntity<Todo> get(@PathVariable("id") Long idTodo) {
        return ResponseEntity.of(this.todoService.findById(idTodo));  // 200 ou 404
    }

    // POST /todo  -> o JSON do Body vira um objeto Todo
    @PostMapping
    public Todo create(@RequestBody Todo todo) {
        return this.todoService.save(todo);
    }
}