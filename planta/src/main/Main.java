package main;

import models.Planta;

public class Main {
    public static void main(String[] args) {

        Planta cenoura = new Planta("Cenoura", "hortaliça", 5.0, 20.0);

        int semanas = 4;
        double aguaNecessaria = cenoura.calcularNecessidadeDeAgua(semanas);
        System.out.println("A hortaliça " + cenoura.getNome()+" necessita de "+
                aguaNecessaria + " litros de água para " + semanas + " semanas.");

        cenoura.irrigar();
    }
}