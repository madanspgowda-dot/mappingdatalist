package com.example.mapingdatalist.Entity;

import jakarta.persistence.*;

@Entity
public class TodoListEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SignupEntity getSignup() {
        return signup;
    }

    public void setSignup(SignupEntity signup) {
        this.signup = signup;
    }

    private Long number;
    @ManyToOne
    @JoinColumn(name="signup_id")
    private SignupEntity signup;
}
