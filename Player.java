import java.util.ArrayList;
import java.util.List;

public class Player {
    private State state;
    private List<String> playlist = new ArrayList<>();
    private int currentTrack = 0;
    private boolean isPlaying = false;

    public Player() {
        // Inicialmente, o player começa no estado ready.
        this.state = new ReadyState();
        // Montando playlist com 12 músicas.
        for (int i = 1; i <= 12; i++) {
            playlist.add("Música " + i);
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public String startPlayback() {
        return "Reproduzindo: " + playlist.get(currentTrack);
    }

    public String nextTrack() {
        currentTrack = (currentTrack + 1) % playlist.size();
        return startPlayback();
    }

    public String previousTrack() {
        currentTrack = (currentTrack - 1 + playlist.size()) % playlist.size();
        return startPlayback();
    }

    // Métodos que acionam as ações no estado atual
    public void play() {
        state.play(this);
    }

    public void stop() {
        state.stop(this);
    }

    public void next() {
        state.next(this);
    }

    public void previous() {
        state.previous(this);
    }
}
