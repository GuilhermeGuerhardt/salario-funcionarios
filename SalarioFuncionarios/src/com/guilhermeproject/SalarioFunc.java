package com.guilhermeproject;

import java.util.Scanner;

public class SalarioFunc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        char sexo, resp;
        int totalFun = 0, totalHom = 0, totalMul = 0, totalMil = 0;
        double sal, somaSalH = 0, medSalH = 0, maiH = 0;

        while (true) {
            System.out.print("Nome: ");
            nome = scanner.nextLine();
            System.out.print("Sexo [M/F]: ");
            sexo = scanner.next().charAt(0);
            System.out.print("Salário: ");
            sal = scanner.nextDouble();

            totalFun++;
            if (sexo == 'M' || sexo == 'm') {
                totalHom++;
                somaSalH += sal;
                if (totalHom == 1) {
                    maiH = sal;
                } else {
                    if (sal > maiH) {
                        maiH = sal;
                    }
                }
            } else if (sexo == 'F' || sexo == 'f') {
                totalMul++;
                if (sal > 1000) {
                    totalMil++;
                }
            }

            System.out.print("Quer continuar? [S/N] ");
            resp = scanner.next().charAt(0);
            if (resp == 'N' || resp == 'n') {
                break;
            }
            System.out.println("------------------------------");
            scanner.nextLine(); // Limpa o buffer do teclado
        }
        medSalH = somaSalH / totalHom;
        System.out.println("\n============ RESULTADOS ============");
        System.out.println("Total de Funcionários: " + totalFun);
        System.out.println("Total de Homens: " + totalHom);
        System.out.println("Total de Mulheres: " + totalMul);
        System.out.println("A média salarial dos Homens é R$" + medSalH);
        System.out.println("Temos " + totalMil + " mulheres ganhando mais de R$1000.");
        System.out.println("O maior salário entre os Homens é de R$" + maiH);
    }
}