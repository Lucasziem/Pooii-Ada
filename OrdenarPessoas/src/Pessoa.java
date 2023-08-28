package com.ada.pooii.ordenacao;

import java.time.LocalDate;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;

    private LocalDate dataDeNascimento;

    public Pessoa(String nome, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                '}';
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        return this.nome.compareTo(outraPessoa.nome);
    }
}
