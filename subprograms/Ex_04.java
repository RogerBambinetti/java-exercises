
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
public class Ex_04 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o peso: ");
        double a = s.nextDouble();
        System.out.println("Informe a altura: ");
        double b = s.nextDouble();
        double imc = imc(a, b);
        String resultado=situacao(imc);
        System.out.println("O IMC é: "+ imc);
        System.out.println("A situação é: " + resultado);

    }

    public static double imc(double a, double b) {
        return a / (b * b);
    }

    public static String situacao(double imc) {
        if (imc < 20) {
            return "Magro!";
        }else if (imc>20 && imc<24){
            return "Normal!";
        }else if(imc>25 && imc<29){
            return "Acima do peso!";
        }else if(imc>30 && imc<34){
            return"Obeso!";
            
        }else{
            return"Muito obeso!";
        }
    }
}
