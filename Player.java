import java.util.List;

public class Player {
    private List<Musica> playlist;
    private Musica musicaAtual;
    private String estadoMusicaAtual;

    /**
     * @return List<Musica> return the playlist
     */
    public List<Musica> getPlaylist() {
        return playlist;
    }

    /**
     * @param playlist the playlist to set
     */
    public void setPlaylist(List<Musica> playlist) {
        this.playlist = playlist;
    }

    /**
     * @return Musica return the musicaAtual
     */
    public Musica getMusicaAtual() {
        return musicaAtual;
    }

    /**
     * @param musicaAtual the musicaAtual to set
     */
    public void setMusicaAtual(Musica musicaAtual) {
        this.musicaAtual = musicaAtual;
    }

    /**
     * @return String return the estadoMusicaAtual
     */
    public String getEstadoMusicaAtual() {
        return estadoMusicaAtual;
    }

    /**
     * @param estadoMusicaAtual the estadoMusicaAtual to set
     */
    public void setEstadoMusicaAtual(String estadoMusicaAtual) {
        this.estadoMusicaAtual = estadoMusicaAtual;
    }

}
