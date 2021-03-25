package br.cordeiro.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // classe mapeada no db
@Table(name = "usuario")
public class Usuario {
    @Id  // anotação para indicar que é chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) //  define a chave será sequencial númerica
    @Column(name = "id") // nome seguindo convenção no bd
    private int id;

    @Column(name = "nome", length = 150, nullable = false)
    private String nome;

    @Column(name = "email", length = 30, nullable = false, unique = true)
    private String email;

    @Column(name = "cpf", length = 11, nullable = false, unique = true)
    private String cpf;

    @Column(name = "senha", length = 20, nullable = false)
    private String senha;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
}
