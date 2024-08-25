public class ReadyState implements State {

    @Override
    public void play(Player player) {
        player.setState(new PlayingState());
        player.setPlaying(true);
        System.out.println(player.startPlayback());
    }

    @Override
    public void stop(Player player) {
        player.setState(new LockedState());
        System.out.println("Player travado.");
    }

    @Override
    public void next(Player player) {
        System.out.println("Nenhum comando: Player pronto, sem reprodução.");
    }

    @Override
    public void previous(Player player) {
        System.out.println("Nenhum comando: Player pronto, sem reprodução.");
    }
}
