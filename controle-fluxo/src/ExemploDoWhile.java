import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        
        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando");
        } while(tocando() == true);

        System.out.println("Alô!");

    }

    private static boolean tocando() {
        boolean ligacaoAtendida = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + ligacaoAtendida);
        return ligacaoAtendida;
    }
    
}
