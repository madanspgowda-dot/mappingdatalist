package com.example.mapingdatalist.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class SignupEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;

    public String getConpassword() {
        return conpassword;
    }

    public void setConpassword(String conpassword) {
        this.conpassword = conpassword;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<TodoListEntity> getTodoList() {
        return todoList;
    }

    public void setTodoList(List<TodoListEntity> todoList) {
        this.todoList = todoList;
    }

    private String conpassword;
    @OneToMany(mappedBy = "signup")
    private List<TodoListEntity> todoList;


}
