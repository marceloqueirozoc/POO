package com.mconstantino;

public class ApoliceTeste {

    public static void main(String[] args) {

        Apolice apolice1 = new Apolice("Marcelo", 34 , 1000);
        apolice1.imprimir();
        System.out.println("Idade: " + apolice1.getIdade());

    }
}
