package br.com.fiap.CrudSpring.service;

import br.com.fiap.CrudSpring.model.Todo;
import br.com.fiap.CrudSpring.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    // Injeção de dependência: você nunca escreve "new TodoRepository()".
    // O Spring cria o objeto e entrega aqui pelo construtor.
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> findAll() {
        return this.todoRepository.findAll();
    }

    // Optional = "pode ter uma tarefa, pode não ter"
    public Optional<Todo> findById(Long id) {
        return this.todoRepository.findById(id);
    }

    // save() faz INSERT se o id for nulo, UPDATE se o id já existir
    public Todo save(Todo todo) {
        return this.todoRepository.save(todo);
    }

    public void delete(Long id) {
        this.todoRepository.deleteById(id);
    }
}