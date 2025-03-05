
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
@Entity
@Table(name = "conta")
public class Conta implements Serializable {

    @Id
    @GeneratedValue
    private int idconta;
    private String agencia;
    private String numero;
    private double saldo;
    @ManyToOne
    @JoinColumn(name = "idcliente")
    private Cliente cliente;

    public Conta() {
    }

    public Conta(int idconta, String agencia, String numero, double saldo, Cliente cliente) {
        this.idconta = idconta;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getIdconta() {
        return idconta;
    }

    public void setIdconta(int idconta) {
        this.idconta = idconta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Conta{" + "idconta=" + idconta + ", agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }
    
}
