package Corrida;

import Carro.Carro;

public class Corrida {
    private Carro carro1;
    private Carro carro2;
    private int distanciaTotal;

    public Corrida(Carro carro1, Carro carro2, int distanciaTotal) {
        this.carro1 = carro1;
        this.carro2 = carro2;
        this.distanciaTotal = distanciaTotal;
    }

    public boolean terminou() {
        return carro1.getDistancia() >= distanciaTotal || carro2.getDistancia() >= distanciaTotal;
    }

    public void mostrarCorrida(int distanciaMaxima) {
        System.out.println("\nEstado atual da corrida:");


        System.out.print("Veículo 1: ");
        for (int i = 0; i < distanciaMaxima; i++) {
            if (i == carro1.getDistancia()) {
                System.out.print(carro1.getNome());
            } else {
                System.out.print("-");
            }
        }
        System.out.println();


        System.out.print("Veículo 2: ");
        for (int i = 0; i < distanciaMaxima; i++) {
            if (i == carro2.getDistancia()) {
                System.out.print(carro2.getNome());
            } else {
                System.out.print("-");
            }
        }
        System.out.println("\n--------------------------------------------------");
    }

    public void determinarVencedor() {
        System.out.println("Corrida finalizada!");
        System.out.println("Distância do Veículo 1: " + carro1.getDistancia());
        System.out.println("Distância do Veículo 2: " + carro2.getDistancia());

        if (carro1.getDistancia() > carro2.getDistancia()) {
            System.out.println("Veículo 1 é o vencedor!");
        } else if (carro2.getDistancia() > carro1.getDistancia()) {
            System.out.println("Veículo 2 é o vencedor!");
        } else {
            System.out.println("Empate!");
        }
    }
}
