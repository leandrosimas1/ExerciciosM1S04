package main;
import models.Animal;

public class Main {
    public static void main(String[] args) {
        Animal leao = new Animal("Leão", " savana", " rugindo", "Carnívoro");
        leao.mover();
        leao.emitirSom();
        leao.alimentar();

        Animal girafa = new Animal("Girafa", " savana", " zumbido","Herbívoro");
        girafa.mover();
        girafa.emitirSom();
        girafa.alimentar();

    }
}