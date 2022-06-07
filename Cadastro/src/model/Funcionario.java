
package model;

import java.util.GregorianCalendar;


public class Funcionario extends Pessoa {
    
    private Integer id;
    
    private GregorianCalendar dataNascimento;
    
    private GregorianCalendar dataCadastro;
    
    private String funcao;
    
    private String setor;

    public Funcionario(Integer id, String nome, GregorianCalendar dataNascimento, String cpf, GregorianCalendar dataCadastro,String funcao,String setor) {
        super(nome,dataNascimento,cpf,dataCadastro);
        this.id = id;
        this.funcao = funcao;
        this.setor = setor;
        
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

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public GregorianCalendar getDataCadastro() {
        return dataCadastro;
    }


    public void setDataCadastro(GregorianCalendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    */
    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
