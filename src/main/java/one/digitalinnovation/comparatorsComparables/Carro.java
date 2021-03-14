package one.digitalinnovation.comparatorsComparables;

public class Carro implements Comparable<Carro> {

    private String marca;
    private String modelo;
    private Integer ano;
    private String variante;

    Carro(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.variante = "Unica";
    }

    Carro(String marca, String modelo, Integer ano, String variante) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.variante = variante;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public String getVariante() {
        return variante;
    }

    public void descricao() {
        System.out.println("#--------CARRO--------#");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Variante: " + variante);
    }

    public String toString() {
        return this.getMarca() + " " + this.getModelo() + " " + this.getAno();
    }

    @Override
    public int compareTo(Carro outroCarro) {
        return this.getAno().compareTo(outroCarro.getAno());
    }
}
