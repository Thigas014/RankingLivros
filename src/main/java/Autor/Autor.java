package Autor;

import Interfaces.AutorIf;

public class Autor implements AutorIf {
    private String nome;
    private double notaMediaGeral;
    private int numeroLivrosBemAvaliados;

    public Autor(String nome, double notaMediaGeral, int numeroLivrosBemAvaliados) {
        this.nome = nome;
        this.notaMediaGeral = notaMediaGeral;
        this.numeroLivrosBemAvaliados = numeroLivrosBemAvaliados;
    }

    public String getNome() { return nome; }
    public double getNotaMediaGeral() { return notaMediaGeral; }
    public int getNumeroLivrosBemAvaliados() { return numeroLivrosBemAvaliados; }

    //@Override
    //public String toString() {
    //    return "Autor: " + nome + "\nNota Média Geral: " + notaMediaGeral + "\nLivros Bem Avaliados: " + numeroLivrosBemAvaliados;
    //}
}
