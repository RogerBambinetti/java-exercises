
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rogerbambinetti
 */
public class Sistema {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcao;
        List<Figura> figuras = new ArrayList<>();
        do {
            System.out.println("0. Sair"
                    + "1. Cadastrar figura"
                    + "2. Listar figuras"
                    + "3. Listar áreas"
                    + "4. Listar per[imetros");
            opcao = s.nextInt();
            switch (opcao) {
                case 1: {
                    System.out.println("Tipo da figura: c/q");
                    char tipoFigura = s.next().charAt(0);
                    if (tipoFigura == 'c') {
                        System.out.println("Cor:");
                        String cor = s.next();
                        System.out.println("Raio:");
                        float raio = s.nextFloat();
                        Figura c = new Circulo(raio, cor);
                        figuras.add(c);

                    } else {
                        System.out.println("Cor:");
                        String cor = s.next();
                        System.out.println("Lado:");
                        float lado = s.nextFloat();
                        Figura q = new Quadrado(lado, cor);
                        figuras.add(q);
                    }
                    break;
                }
                case 2: {
                    for (Figura f : figuras) {
                        System.out.println(f.toString());
                    }
                    break;
                }
                case 3: {
                    for (Figura f : figuras) {
                        System.out.println(f.calculaArea());
                    }
                    break;
                }
                case 4: {
                    for (Figura f : figuras) {
                        System.out.println(f.calculaPerimetro());
                    }
                    break;
                }
            }
        } while (opcao != 0);
    }
}
