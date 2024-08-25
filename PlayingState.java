public class PlayingState implements State {

    @Override
    public void play(Player player) {
        player.setState(new ReadyState());
        player.setPlaying(false);
        System.out.println("Reprodução pausada.");
    }

    @Override
    public void stop(Player player) {
        player.setState(new LockedState());
        player.setPlaying(false);
        System.out.println("Reprodução parada. Player travado.");
    }

    @Override
    public void next(Player player) {
        System.out.println(player.nextTrack());
    }

    @Override
    public void previous(Player player) {
        System.out.println(player.previousTrack());
    }
}
