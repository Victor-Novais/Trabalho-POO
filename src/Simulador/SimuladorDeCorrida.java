package Simulador;
import Carro.Carro;
import Corrida.Corrida;
import java.util.Scanner;

public class SimuladorDeCorrida {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a distância máxima da corrida: ");
        int distanciaMaxima = scanner.nextInt();


        Carro carro1 = new Carro("🚗");
        Carro carro2 = new Carro("🚙");


        Corrida corrida = new Corrida(carro1, carro2, distanciaMaxima);


        GeradorDeVelocidade geradorDeVelocidade = new GeradorDeVelocidade();


        while (!corrida.terminou()) {
            int velocidadeCarro1 = geradorDeVelocidade.sortearVelocidade();
            int velocidadeCarro2 = geradorDeVelocidade.sortearVelocidade();


            carro1.mover(velocidadeCarro1);
            carro2.mover(velocidadeCarro2);


            corrida.mostrarEstadoCorridaComEstrada(distanciaMaxima);


            Thread.sleep(1000);
        }


        corrida.determinarVencedor();

        scanner.close();
    }
}