package model;

import java.util.GregorianCalendar;


public class Pessoa{
    
    private String nome;
    
    private GregorianCalendar dataNascimento;
    
    private GregorianCalendar dataCadastro;
    
    private String cpf;

    public Pessoa(String nome, GregorianCalendar dataNascimento, String cpf, GregorianCalendar dataCadastro) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.dataCadastro = dataCadastro;
    }


    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public GregorianCalendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(GregorianCalendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String email) {
        this.cpf = cpf;
    }

    public GregorianCalendar getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(GregorianCalendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
}
