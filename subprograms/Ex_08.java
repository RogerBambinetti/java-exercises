
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ROGER
 */
public class Ex_08 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char continuar;
        int contGeral = 0;
        int contCitacao = 0;
        int contCitacao2 = 0;
        do {
            System.out.println("Informe o nome do aluno: ");
            String nome = s.next();
            System.out.println("Informe a média 1: ");
            double m1 = s.nextDouble();
            System.out.println("Informe a média 2: ");
            double m2 = s.nextDouble();
            System.out.println("Informe a média 3: ");
            double m3 = s.nextDouble();
            System.out.println("Informe a média 4: ");
            double m4 = s.nextDouble();
            double media = mediaAnual(m1, m2, m3, m4);
            boolean duasDez = mediasBimestraisDez(m1, m2, m3, m4);
            String resultado = citacao(media, duasDez);
            contGeral++;
            if (resultado.equalsIgnoreCase("Honras pelo bom aproveitamento")) {
                contCitacao++;
            }
            if (resultado.equalsIgnoreCase("Aluno exemplar")) {
                contCitacao2++;
            }
            System.out.println(resultado);
            System.out.println("Deseja continuar? S/N");
            continuar = s.next().charAt(0);

        } while (continuar == 's');

        System.out.println("Alunos que receberam honras pelo bom aproveitamento: " + contCitacao);
        System.out.println("Percentual de alunos exemplares: " + ((contCitacao2 / contGeral) * 100));
    }

    public static double mediaAnual(double m1, double m2, double m3, double m4) {
        return (m1 + m2 + m3 + m4) / 4;

    }

    public static boolean mediasBimestraisDez(double m1, double m2, double m3, double m4) {
        int cont = 0;
        if (m1 == 10) {
            cont++;
        }
        if (m2 == 10) {
            cont++;
        }
        if (m3 == 10) {
            cont++;
        }
        if (m4 == 10) {
            cont++;
        }
        if (cont > 1) {
            return true;
        } else {
            return false;
        }
    }

    public static String citacao(double media, boolean duasDez) {
        if (media >= 7 && media < 8) {
            return "Honras pelo bom aproveitamento";
        } else if (media >= 8 && media < 9) {
            return "Honras pelo ótimo aproveitamento";
        } else if (media >= 9 && media <= 10 && duasDez == false) {
            return "Honras pelo excelente aproveitamento";
        } else if (media >= 9 && media <= 10 && duasDez == true) {
            return "Aluno exemplar";
        } else {
            return "Erro";
        }
    }
}
