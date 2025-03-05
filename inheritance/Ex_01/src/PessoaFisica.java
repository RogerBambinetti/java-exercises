/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rogerbambinetti
 */
public class PessoaFisica extends Pessoa {

    private String cpf;
    private String rg;
    private float salario;
    private int quantidadeDependentes;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, String telefone, String endereco, String cpf, String rg, float salario, int quantidadeDependentes) {
        super(nome, telefone, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
        this.quantidadeDependentes = quantidadeDependentes;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getQuantidadeDependentes() {
        return quantidadeDependentes;
    }

    public void setQuantidadeDependentes(int quantidadeDependentes) {
        this.quantidadeDependentes = quantidadeDependentes;
    }

    @Override
    public String toString() {
        return super.toString() + "PessoaFisica{" + "cpf=" + cpf + ", rg=" + rg + ", salario=" + salario + ", quantidadeDependentes=" + quantidadeDependentes + '}';
    }

    @Override
    public float getImpostoDevido() {
        float salario = this.salario - (50 * quantidadeDependentes);
        if (salario <= 500) {
            return 0;
        } else if (salario > 500 && salario <= 1000) {
            return (float) (salario * 0.05);
        } else {
            return (float) (salario * 0.07);
        }
    }
}
