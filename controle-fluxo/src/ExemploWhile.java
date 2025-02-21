
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        
        Double mesada = 50.0;
        Double valorDoce = valorAleatorio();

        while (valorDoce <= mesada) {
            System.out.printf("Doce do valor: %.2f adicionado no carrinho\n", + valorDoce);
            mesada = mesada - valorDoce;
            valorDoce = valorAleatorio();
        }

        System.out.printf("\nMesada: %.2f\n", mesada);
        System.out.println("Joãozinho gastou quase toda a mesada em doces");


    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
    
}