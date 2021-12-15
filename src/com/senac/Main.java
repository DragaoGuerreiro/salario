package com.senac;

public class Main {

    public static void main(String[] args) {

        String nome = "Marcelo";
        int horas = 8;
        double salarioPlenoPorHora = 45;
        double salarioJuniorPorHora = 25;
        double salarioSeniorPorHora = 60;
        int dia = 22;
        double resultadoPleno = horas * salarioPlenoPorHora * dia;
        double resultadoJunior = horas * salarioJuniorPorHora * dia;
        double resultadoSenior = horas * salarioSeniorPorHora * dia;
        double euro = 6.4;
        double JuniorPortugal = 2000 * euro / dia / horas;
        double PlenoPortugal = 3000 * euro / dia / horas;
        double SeniorPortugal = 4000 * euro / dia / horas;



        System.out.println(nome + " ganha " + resultadoPleno + " no mês como Pleno ");
        System.out.println(nome + " ganha " + resultadoJunior + " no mês como Junior");
        System.out.println(nome + " ganha " + resultadoSenior + " no mês como Senior");
        System.out.println(nome + " ganha " + JuniorPortugal + " por dia em Portugal.");
        System.out.println(nome + " ganha " + PlenoPortugal + " por dia em Portugal.");
        System.out.println(nome + " ganha " + SeniorPortugal + " por dia em Portugal.");



    }
}
