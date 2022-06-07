
package model;

import java.util.GregorianCalendar;


public class Cliente extends Pessoa {
    
    private Integer id;
    
    private GregorianCalendar dataNascimento;
    
    private GregorianCalendar dataCadastro;
    
    private String cpf;

    public Cliente(Integer id, String nome, GregorianCalendar dataNascimento, String cpf, GregorianCalendar dataCadastro) {
        super(nome,dataNascimento,cpf,dataCadastro);
        this.id = id;
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /*public String getNome() {
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
    */
}
