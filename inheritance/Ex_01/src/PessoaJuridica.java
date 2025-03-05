/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rogerbambinetti
 */
public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private float faturamentoMes;
    private int categoria;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String cnpj, float faturamentoMes, int categoria, String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
        this.cnpj = cnpj;
        this.faturamentoMes = faturamentoMes;
        this.categoria = categoria;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public float getFaturamentoMes() {
        return faturamentoMes;
    }

    public void setFaturamentoMes(float faturamentoMes) {
        this.faturamentoMes = faturamentoMes;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + "PessoaJuridica{" + "cnpj=" + cnpj + ", faturamentoMes=" + faturamentoMes + ", categoria=" + categoria + '}';
    }

    @Override
    public float getImpostoDevido() {
        if (categoria == 1) {
            return (float) (faturamentoMes * 0.02);
        } else if (categoria == 2) {
            return (float) (faturamentoMes * 0.05);
        } else {
            return (float) (faturamentoMes * 0.15);
        }
    }
}
