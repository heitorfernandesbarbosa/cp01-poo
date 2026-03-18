package br.com.fiapride.model;

public class Veiculo {
    
    // Encapsulamento
    private String individuo;
    private String placa;
    private double gas; // Alterado para double para aceitar litros fracionados

    // Construtor padrão
    public Veiculo() {}

    // Métodos para manipular o combustível
    public void adicionar(double quantidade) {
        this.gas += quantidade;
    }

    public void gastar(double quantidade) {
        if (this.gas >= quantidade) {
            this.gas -= quantidade;
        } else {
            System.out.println("Combustível insuficiente!");
        }
    }

    // Getters e Setters (Necessários para acessar os dados privados)
    public String getIndividuo() { return individuo; }
    public void setIndividuo(String individuo) { this.individuo = individuo; }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public double getGas() { return gas; }
}