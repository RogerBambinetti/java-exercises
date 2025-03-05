
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
 * @author aluno
 */
public class Sistema {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcao = 0;
        List<Funcionario> funcionarios = new ArrayList<>();
        do {
            System.out.println("+------------------------+ \n"
                    + "|1. Cadastrar funcionário| \n"
                    + "|2. Listar funcionário   | \n"
                    + "+------------------------+ \n");
            opcao = s.nextInt();
            switch (opcao) {
                case 1: {
                    System.out.println("Nome:");
                    String nome = s.next();
                    System.out.println("Sexo:");
                    char sexo = s.next().charAt(0);
                    System.out.println("Horas trabalhadas:");
                    float horasTrabalhadas = s.nextFloat();
                    System.out.println("Valor hora:");
                    float valorHora = s.nextFloat();
                    System.out.println("Possui dependentes?");
                    char dependentes = s.next().charAt(0);
                    char continuar;
                    if (dependentes == 's') {
                        Funcionario f = new Funcionario(nome, sexo, horasTrabalhadas, valorHora);
                        funcionarios.add(f);
                        do {
                            System.out.println("Nome dependente:");
                            String nomeDependente = s.next();
                            System.out.println("Cpf dependente:");
                            String cpfDependente = s.next();
                            System.out.println("Idade dependente:");
                            int idadeDependente = s.nextInt();
                            Dependente d = new Dependente(nomeDependente, cpfDependente, idadeDependente);
                            f.addDependente(d);
                            System.out.println("Deseja continuar?");
                            continuar = s.next().charAt(0);

                        } while (continuar == 's');

                    } else {
                        Funcionario f = new Funcionario(nome, sexo, horasTrabalhadas, valorHora);
                        funcionarios.add(f);
                    }
                    break;
                }
                case 2: {
                    System.out.println("Funcionário:");
                    String nomeFuncionario = s.next();
                    for (Funcionario f : funcionarios) {
                        if (nomeFuncionario.equals(f.getNome())) {
                            System.out.println(f.toString());
                            System.out.println("Salário bruto: " + f.calculaSalarioBruto());
                            System.out.println("Desconto INSS: " + f.calculaDescontoInss());
                            System.out.println("Desconto IR: " + f.calculaDescontoIr());
                            System.out.println("Salário líquido: " + (f.calculaSalarioBruto() - f.calculaDescontoInss() - f.calculaDescontoIr()));
                        }
                    }
                    break;
                }
            }
        } while (opcao != 0);
    }
}
