/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rogerbambinetti
 */
public class Automovel {

    private int placa;
    private Fabricante fabricante;
    private String modelo;
    private int ano;

    public Automovel() {
    }

    public Automovel(int placa, Fabricante fabricante, String modelo, int ano) {
        this.placa = placa;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Automovel{" + "placa=" + placa + ", fabricante=" + fabricante + ", modelo=" + modelo + ", ano=" + ano + '}';
    }
    
    
    
    
}
