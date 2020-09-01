package com.mconstantino;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int a = 10;
        String va = "10";
        int resultado = a + Integer.parseInt(va);
        System.out.println("Resultado: " + resultado);

        String valordeA = String.valueOf(a);
        String valorDeA2 = Integer.toString(a);

        /*
        Algumas classes Wrappers
        Tipo.parseTipo(variável);
        Integer.parseInt(variável);
        Double.parseDouble(Variável);
        String valordeA = String.valueOf(variável);
        String valorDeA2 = Integer.toString(variável);
        */

    }
}
