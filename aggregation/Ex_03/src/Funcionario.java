
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
public class Funcionario {

    private String nome;
    private char sexo;
    private float horasTrabalhadas;
    private float valorHora;
    private List<Dependente> dependentes = new ArrayList<>();

    public Funcionario(String nome, char sexo, float horasTrabalhadas, float valorHora) {
        this.nome = nome;
        this.sexo = sexo;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public void addDependente(Dependente d) {
        dependentes.add(d);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", sexo=" + sexo + ", horasTrabalhadas=" + horasTrabalhadas + ", valorHora=" + valorHora + '}';
    }

    public float calculaSalarioBruto() {
        return horasTrabalhadas * valorHora + (50 * dependentes.size());
    }

    public float calculaDescontoInss() {
        float salario = horasTrabalhadas * valorHora + (50 * dependentes.size());
        if (salario <= 1000) {
            return (float) (salario * 0.085);
        } else {
            return (float) (salario * 0.09);
        }
    }

    public float calculaDescontoIr() {
        float salario = horasTrabalhadas * valorHora + (50 * dependentes.size());
        if (salario < 500) {
            return 0;
        } else if (salario > 500 && salario <= 1000) {
            return (float) (salario * 0.05);
        } else {
            return (float) (salario * 0.07);

        }

    }
}
