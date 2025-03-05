/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rogerbambinetti
 */
public class Circulo extends Figura {

    private float raio;

    public Circulo() {
    }

    public Circulo(float raio, String cor) {
        super(cor);
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    public float calculaArea() {
        return (float) (3.14 * (raio * raio));
    }

    @Override
    public float calculaPerimetro() {
        return (float) (2 * raio * 3.14);
    }

    @Override
    public String toString() {
        return super.toString() + "Circulo{" + "raio=" + raio + '}';
    }

}
