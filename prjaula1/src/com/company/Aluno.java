package com.company;

public class Aluno {

    public int rm;
    public String nome;
    public String email;

    public void matricular(){
        System.out.println("Aluno Matriculado com Sucesso.");
        System.out.println("Dados do Aluno:");
        System.out.println(imprimir());
        System.out.println("------------");
    }

    private String imprimir() {
        return "RM: " + rm + ", Nome: " + nome + ", Email: " + email;
    }

    public void cancelarMatricula(){
        System.out.println("Aluno com Matricula Cancelada.");
        System.out.println("Dados do Ex-Aluno:");
        System.out.println(imprimir());
        System.out.println("------------");
    }

}
