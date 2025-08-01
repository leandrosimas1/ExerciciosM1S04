package br.senai.futurodev.exercicios.main;

import br.senai.futurodev.exercicios.models.FrequenciaCardiaca;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = entrada.nextLine();

        System.out.println("Digite sua data de nascimento:");
        String dataNascimentoInput = entrada.nextLine();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoInput);

        FrequenciaCardiaca pessoa = new FrequenciaCardiaca(nome,sobrenome,dataNascimento);

        System.out.println("Informações baseadas em seus dados:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Sobrenome: " + pessoa.getSobrenome());
        System.out.println("Idade: " + pessoa.calcularIdade()+ " anos.");
        System.out.println("Frequência cardíaca máxima: " + pessoa.frequenciaCardiacaMax());
        System.out.println("Frequência cardíaca alvo: " + pessoa.frequenciaCardiacaAlvo());
    }
}