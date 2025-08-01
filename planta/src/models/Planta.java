package models;

public class Planta {
    public String nome;
    public String tipo;
    public double necessidadeDeAgua;
    public double areaCultivo;

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public double getNecessidadeDeAgua() {
        return necessidadeDeAgua;
    }

    public double getAreaCultivo() {
        return areaCultivo;
    }

    public Planta(String nome, String tipo, double necessidadeDeAgua, double areaCultivo) {
        this.nome = nome;
        this.tipo = tipo;
        this.necessidadeDeAgua = necessidadeDeAgua;
        this.areaCultivo = areaCultivo;
    }

    public double calcularNecessidadeDeAgua(int qntdSemanas){
        return areaCultivo * qntdSemanas;
    }

    public void irrigar (){
        System.out.println("A hortaliça " + nome + " foi irrigada com sucesso!");
    }
}
