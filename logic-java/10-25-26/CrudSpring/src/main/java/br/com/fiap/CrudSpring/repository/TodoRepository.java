package br.com.fiap.CrudSpring.repository;

import br.com.fiap.CrudSpring.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> { }