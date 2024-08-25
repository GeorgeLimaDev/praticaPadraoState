public class Cliente {

    public static void main(String[] args) {
        Player player = new Player();

        System.out.println("Inicialmente no estado Ready:");

        player.play();
        player.next();
        player.previous();
        player.play();

        System.out.println("\nEstado após pausar a reprodução (Ready):");

        player.next();
        player.stop();

        System.out.println("\nEstado após bloquear (Locked):");

        player.play();
        player.stop();
        player.stop();

        System.out.println("\nEstado após tentar bloquear novamente (Locked):");

        player.play();
        player.play();

        System.out.println("\nEstado após retomar reprodução (Playing):");

        player.next();
        player.stop();

        System.out.println("\nEstado após parar a reprodução e bloquear (Locked):");

        player.previous();
        player.play();
        player.play();
        player.stop();

        System.out.println("\nEstado final após várias operações:");

        player.next();
        player.previous();
        player.play();
    }
}
