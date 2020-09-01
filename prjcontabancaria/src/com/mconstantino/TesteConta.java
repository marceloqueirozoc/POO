package com.mconstantino;

public class TesteConta {

    public static void main(String[] args) {
	// write your code here

        Conta conta1, conta2;
        conta1 = new Conta();
        conta1.cpmf = 0.20; //pessimo uso de atributo estatico
        conta1.cliente = "Omar";
        conta1.numero = 1;
        conta1.depositarConta(1000);
        conta1.debitarConta(100);
        System.out.println("Saldo da Conta: " + conta1.saldo);

        conta2 = new Conta();
        conta2.cliente = "Cris";
        conta2.numero = 1;
        conta2.depositarConta(500);
        conta2.debitarConta(100);
        System.out.println("Saldo da Conta: " + conta2.saldo);

    }
}
