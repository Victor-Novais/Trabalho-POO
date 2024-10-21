package Carro;

public class Carro {
    private String nome;
    private int distancia;
    private int velocidade;

    public Carro(String nome) {
        this.nome = nome;
        this.distancia = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getDistancia() {
        return distancia;
    }

    public int getVelocidade() {
        return velocidade;
    }


    public void mover(int velocidade) {
        this.velocidade = velocidade;
        this.distancia += velocidade;
    }
}