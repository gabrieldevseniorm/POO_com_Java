package concessionaria;

public class Carro {

    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    // Construtor
    public Carro(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para exibir os dados
    public void exibirDados() {
        System.out.println("\n===== DADOS DO CARRO =====");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.println("==========================");
    }
}