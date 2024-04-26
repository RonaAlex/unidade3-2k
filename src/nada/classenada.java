package nada;

import java.util.Scanner;

public class classenada {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        int matricula;
        int idade;
        int estadoCivil;
        int quantidadeCasados = 0;
        int quantidadeSolteirosEntre20e30 = 0;
        int somaIdadeViuvos = 0;
        int quantidadeViuvos = 0;
        int quantidadeDesquitados = 0;
        int quantidadeTotal = 0;
        int idadeMaisVelha = Integer.MIN_VALUE;
        int idadeMaisNova = Integer.MAX_VALUE;
        int matriculaMaisNova = 0;

        System.out.println("Digite a matrícula, idade e estado civil (1-Casado, 2-Solteiro, 3-Viúvo, 4-Desquitado):");
        matricula = scanner.nextInt();

        while (matricula >= 0) {
            idade = scanner.nextInt();
            estadoCivil = scanner.nextInt();

            quantidadeTotal++;

            if (estadoCivil == 1) {
                quantidadeCasados++;
            } else if (estadoCivil == 2 && idade >= 20 && idade <= 30) {
                quantidadeSolteirosEntre20e30++;
            } else if (estadoCivil == 3) {
                quantidadeViuvos++;
                somaIdadeViuvos += idade;
            } else if (estadoCivil == 4) {
                quantidadeDesquitados++;
            }

            if (idade > idadeMaisVelha) {
                idadeMaisVelha = idade;
            }

            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                matriculaMaisNova = matricula;
            }

            System.out.println("Digite a matrícula, idade e estado civil (ou um número negativo para encerrar):");
            matricula = scanner.nextInt();
        }

        double mediaIdadeViuvos = quantidadeViuvos > 0 ? (double) somaIdadeViuvos / quantidadeViuvos : 0;
        double porcentagemDesquitados = (quantidadeDesquitados * 100.0) / quantidadeTotal;

        System.out.println("Quantidade de pessoas casadas: " + quantidadeCasados);
        System.out.println("Quantidade de pessoas solteiras com idade entre 20 e 30 anos: " + quantidadeSolteirosEntre20e30);
        System.out.println("Média de idade das pessoas viúvas: " + mediaIdadeViuvos);
        System.out.println("Porcentagem de pessoas desquitadas: " + porcentagemDesquitados + "%");
        System.out.println("Idade da pessoa mais velha: " + idadeMaisVelha);
        System.out.println("Matrícula da pessoa mais nova: " + matriculaMaisNova);

        scanner.close();    
    }

}       
  