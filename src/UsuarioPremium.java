public class UsuarioPremium extends Usuario {
    private double precoMensal;
    private String musicaAtual;

    public UsuarioPremium(int id, String nome, String email, double precoMensal) {
        super(id, nome, email);
        this.precoMensal = precoMensal;
    }

    @Override
    public void exibirInfo() {
        System.out.println("[Premium] " + nome + " - " + email + " (R$" + precoMensal + "/mês)");
    }

    public void ouvirMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println(nome + " está ouvindo: " + musicaAtual);
    }

    public void baixar(String conteudo) {
        System.out.println(nome + " baixou: " + conteudo);
    }
}
