package br.senai.futurodev.exercicios.models;

import java.time.LocalDate;
import java.time.Period;

public class FrequenciaCardiaca {
    public String nome;
    public String sobrenome;
    public LocalDate dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public FrequenciaCardiaca(String nome, String sobrenome, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }

    public int calcularIdade() {
        LocalDate idade = LocalDate.now();
        return Period.between(dataNascimento, idade).getYears();
    }

    public int frequenciaCardiacaMax(){
        return 220 - calcularIdade();
    }
    public String frequenciaCardiacaAlvo(){
        int frequenciaMaxima = frequenciaCardiacaMax();
        int limiteInferior = (int) (frequenciaMaxima * 0.50);
        int limiteSuperior = (int) (frequenciaMaxima * 0.85);

        return limiteInferior + limiteSuperior + "bpm";

    }

}

