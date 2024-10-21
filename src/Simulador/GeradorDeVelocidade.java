package Simulador;

import java.util.Random;

public class GeradorDeVelocidade {
    private Random random;

    public GeradorDeVelocidade() {
        random = new Random();
    }


    public int sortearVelocidade() {
        return random.nextInt(3) + 1;
    }
}
