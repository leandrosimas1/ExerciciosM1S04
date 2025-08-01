package models;

public class Animal {
    public String nome;
    public String habitat;
    public String som;
    public String tipoAlimentacao;

    public Animal(String nome, String habitat, String som, String tipoAlimentacao) {
        this.nome = nome;
        this.habitat = habitat;
        this.som = som;
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public String mover() {
        System.out.println(nome + " está se movendo na" + habitat + ".");
        return "";
    }

    public String emitirSom() {
        System.out.println(nome + " está" + som + " enquanto se alimenta.");
        return "";
    }

    public String alimentar() {
        if ("Herbívoro".equalsIgnoreCase(tipoAlimentacao)) {
            System.out.println(nome + " está se alimentando de plantas.");
        } else if ("Carnívoro".equalsIgnoreCase(tipoAlimentacao)) {
            System.out.println(nome + " está se alimentando de carne.");
        } else {
            System.out.println(nome + " não possuí registros.");
        }
        return "";
    }
}