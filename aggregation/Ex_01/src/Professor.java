/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rogerbambinetti
 */
class Professor {
    private int matricula;
    private String nome;
    private String cpf;
    private String dataNacscimento;
    private String formacao;

    public Professor(int matricula, String nome, String cpf, String dataNacscimento, String formacao) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNacscimento = dataNacscimento;
        this.formacao = formacao;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNacscimento() {
        return dataNacscimento;
    }

    public void setDataNacscimento(String dataNacscimento) {
        this.dataNacscimento = dataNacscimento;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return "Professor{" + "matricula=" + matricula + ", nome=" + nome + ", cpf=" + cpf + ", dataNacscimento=" + dataNacscimento + ", formacao=" + formacao + '}';
    }
    
    
}
