package br.com.fiap.CrudSpring.model;

import jakarta.persistence.*;

@Entity                       // "esta classe é uma tabela"
@Table(name = "TODOS")        // nome da tabela no Oracle
public class Todo {

    @Id                                                   // chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // o banco gera o número
    @Column(name = "ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "COMPLETED")
    private Character completed;   // 'S' ou 'N'

    public Todo() { }              // a JPA exige um construtor vazio

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public Character getCompleted() { return completed; }
    public void setCompleted(Character completed) { this.completed = completed; }
}