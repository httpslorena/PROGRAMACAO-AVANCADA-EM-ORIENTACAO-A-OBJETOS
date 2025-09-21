import java.util.ArrayList;

public class AlbumPlaylist {
    private String nome;
    private int ano;
    private ArrayList<String> musicas;

    public AlbumPlaylist(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
        this.musicas = new ArrayList<>();
    }

    public void addMusica(String musica) {
        musicas.add(musica);
    }

    public void exibirInfo() {
        System.out.println("Álbum/Playlist: " + nome + " (" + ano + ")");
        System.out.println("Músicas: " + musicas);
    }
}
