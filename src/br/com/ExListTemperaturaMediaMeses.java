package br.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class ExListTemperaturaMediaMeses {



        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            List<Double> temperaturas = new ArrayList<>();
            List<String> meses = new ArrayList<>() {{
                add("1 - Janeiro");
                add("2 - Fevereiro");
                add("3 - Março");
                add("4 - Abril");
                add("5 - Maio");
                add("6 - Junho");
            }};
            double soma = 0;
            for (int i = 1; i <= 6; i++) {
                System.out.println("Digite a temperatura média do mês: ");
                double temperaturaMediaMes = scan.nextDouble();
                temperaturas.add(temperaturaMediaMes);
                soma += temperaturaMediaMes;
            }
            double media = soma / 6;
            //MÉDIA SEMESTRAL DAS TEMPERATURAS
            System.out.println("Média semestral das temperaturas: " + (String.format("%.1f", media)));

            //MESES E RESPECTIVAS TEMPERATURAS ACIMA DA MÉDIA
            for (int j = 0; j < 6; j++) {
                if (temperaturas.get(j) > media)
                    System.out.println("Meses com temperatura acima da média: " + meses.get(j) + ", temperatura: " + temperaturas.get(j));
            }

        }
    }


