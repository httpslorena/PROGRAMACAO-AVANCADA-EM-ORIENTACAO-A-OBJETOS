public class Musica {
    private int id;
    private String titulo;
    private double duracao;
    private String artista;
    private AlbumPlaylist album;

    public Musica(int id, String titulo, double duracao, String artista, AlbumPlaylist album) {
        this.id = id;
        this.titulo = titulo;
        this.duracao = duracao;
        this.artista = artista;
        this.album = album;
    }

    public void tocar() {
        System.out.println("🎵 Tocando: " + titulo + " - " + artista + " (" + duracao + " min)");
    }

    // ✅ Adicione este método
    public String getTitulo() {
        return titulo;
    }
}
