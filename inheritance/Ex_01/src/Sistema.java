
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
        List<Pessoa> pessoas = new ArrayList<>();
        do {
            System.out.println("0. Sair \n"
                    + "1. Inserir pessoa \n"
                    + "2. Listar pessoas");
            opcao = s.nextInt();
            switch (opcao) {
                case 1: {
                    System.out.println("Pessoa física ou jurídica? f/j");
                    char tipoPessoa = s.next().charAt(0);
                    if (tipoPessoa == 'f') {
                        System.out.println("Nome:");
                        String nome = s.next();
                        System.out.println("Telefone:");
                        String telefone = s.next();
                        System.out.println("Endereco:");
                        String endereco = s.next();
                        System.out.println("Cpf:");
                        String cpf = s.next();
                        System.out.println("Rg:");
                        String rg = s.next();
                        System.out.println("Salário:");
                        float salario = s.nextFloat();
                        System.out.println("Quantidade dependentes:");
                        int quantidadeDependentes = s.nextInt();
                        Pessoa p = new PessoaFisica(nome, telefone, endereco, cpf, rg, salario, quantidadeDependentes);
                        pessoas.add(p);

                    } else {
                        System.out.println("Nome:");
                        String nome = s.next();
                        System.out.println("Telefone:");
                        String telefone = s.next();
                        System.out.println("Endereco:");
                        String endereco = s.next();
                        System.out.println("Cnpj:");
                        String cnpj = s.next();
                        System.out.println("Faturamento mês:");
                        float faturamentoMes = s.nextFloat();
                        System.out.println("Categoria:");
                        int categoria = s.nextInt();
                        Pessoa p = new PessoaJuridica(cnpj, faturamentoMes, categoria, nome, telefone, endereco);
                        pessoas.add(p);
                    }
                    break;
                }
                case 2: {
                    for (Pessoa p : pessoas) {
                        System.out.println(p.toString());
                        System.out.println("imposto= " + p.getImpostoDevido());
                    }
                }

            }
        } while (opcao != 0);
    }
}
