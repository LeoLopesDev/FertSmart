package br.com.fertsmart.entities;

public class User {
    private Integer cpf;
    private String email;
    private Long id;

    public User() {
    }

    public User(Integer cpf, String email, Long id) {
        this.cpf = cpf;
        this.email = email;
        this.id = id;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
