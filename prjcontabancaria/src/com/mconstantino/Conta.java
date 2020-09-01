package com.mconstantino;

import java.time.LocalDate;

public class Conta {

    public int numero;
    public String cliente;
    public double saldo;
    public LocalDate dataAbertura;
    public static double cpmf = 0.01; //se alguem alterar altera para todos, compartilho o atributo


    public void debitarConta(double valor){
        if(valor <= saldo){
            double vlrDesconto = valor * cpmf;
            this.saldo -= (valor + vlrDesconto);
        }
    }

    public void depositarConta(double valor){
        this.saldo += valor;
    }
}
