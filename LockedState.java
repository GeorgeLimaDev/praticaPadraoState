public class LockedState implements State {

    @Override
    public void play(Player player) {
        if (player.isPlaying()) {
            player.setState(new ReadyState());
            System.out.println("Player destravado, pronto para reproduzir.");
        } else {
            System.out.println("Player travado, não é possível reproduzir.");
        }
    }

    @Override
    public void stop(Player player) {
        if (player.isPlaying()) {
            player.setState(new ReadyState());
            player.setPlaying(false);
            System.out.println("Player parado e destravado.");
        } else {
            System.out.println("Player já está travado.");
        }
    }

    @Override
    public void next(Player player) {
        System.out.println("Nenhum comando: Player travado.");
    }

    @Override
    public void previous(Player player) {
        System.out.println("Nenhum comando: Player travado.");
    }
}
