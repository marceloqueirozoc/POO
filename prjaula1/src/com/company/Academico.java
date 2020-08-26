package com.company;

public class Academico {

    public static void main(String[] args) {

        Aluno aluno1, aluno2;

        aluno1 = new Aluno();
            aluno1.rm = 1;
            aluno1.nome ="Joao";
            aluno1.email = "joao@fatec.com";

        aluno2 = new Aluno();
            aluno2.rm = 2;
            aluno2.nome = "Maria";
            aluno2.email = "maria@fatec.com";

        //Matricular os dois alunos
        aluno1.matricular();
        aluno2.matricular();

        //Cancelar Matrícula dos dois alunos
        aluno1.cancelarMatricula();
        aluno2.cancelarMatricula();
    }
}
