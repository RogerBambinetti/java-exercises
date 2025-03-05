/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rogerbambinetti
 */
public class Quadrado extends Figura {

    private float lado;

    public Quadrado() {
    }

    public Quadrado(float lado, String cor) {
        super(cor);
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float calculaArea() {
        return lado * lado;
    }

    @Override
    public float calculaPerimetro() {
        return lado * 4;
    }

    @Override
    public String toString() {
        return super.toString() + "Quadrado{" + "lado=" + lado + '}';
    }

}
