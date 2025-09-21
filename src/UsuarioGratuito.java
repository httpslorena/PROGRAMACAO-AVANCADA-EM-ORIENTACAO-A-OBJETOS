public class UsuarioGratuito extends Usuario {
    private boolean anuncios;
    private String musicaAtual;

    public UsuarioGratuito(int id, String nome, String email, boolean anuncios) {
        super(id, nome, email);
        this.anuncios = anuncios;
    }

    @Override
    public void exibirInfo() {
        System.out.println("[Gratuito] " + nome + " - " + email + " (Anúncios: " + anuncios + ")");
    }

    public void ouvirMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println(nome + " está ouvindo: " + musicaAtual);
    }

    public void ouvirAnuncio() {
        System.out.println(nome + " está ouvindo um anúncio.");
    }
}
