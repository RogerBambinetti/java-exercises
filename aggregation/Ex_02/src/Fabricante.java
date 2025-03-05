/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rogerbambinetti
 */
public class Fabricante {

    private String nome;
    private String país;

    public Fabricante() {
    }

    public Fabricante(String nome, String país) {
        this.nome = nome;
        this.país = país;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaís() {
        return país;
    }

    public void setPaís(String país) {
        this.país = país;
    }

    @Override
    public String toString() {
        return "Fabricante{" + "nome=" + nome + ", pa\u00eds=" + país + '}';
    }

}
