package com.mconstantino;

public class Apolice {

        private String nomeSegurado;
        private int idade;
        private float valorPremio;

        public Apolice(String nomeSegurado, int idade, float valorPremio){
            this.nomeSegurado = nomeSegurado;
            this.idade = idade;
            this.valorPremio = valorPremio;
        }

        public void imprimir(){
            System.out.println("Nome: "+ nomeSegurado + ", Idade: "+ idade + ", Valor Premio: "+ valorPremio);
        }

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(float valorPremio) {
        this.valorPremio = valorPremio;
    }
}
