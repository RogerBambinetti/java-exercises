
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
        double menoraltura = Double.MAX_VALUE;
        double maioraltura = Double.MIN_VALUE;
        char maiorsexo = 'x';
        int contf = 0;
        int contm = 0;
        double somaf = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Informe a altura: ");
            double altura = s.nextDouble();
            System.out.println("Informe o sexo (F/M): ");
            char sexo = s.next().charAt(0);
            if (sexo == 'f') {
                contf++;
                somaf = somaf + altura;

            } else {
                contm++;
            }
            if (altura < menoraltura) {
                menoraltura = altura;

            }
            if (altura > maioraltura) {
                maioraltura = altura;
                maiorsexo = sexo;
            }
        }
        double mediaf = somaf / contf;
        System.out.println("A menor altura é: " + menoraltura);
        System.out.println("A média da altura das mulheres é: " + mediaf);
        System.out.println("O número de homens é: " + contm);
        System.out.println("O sexo da pessoa mais alta é: " + maiorsexo);
    }

}
