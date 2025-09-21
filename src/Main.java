public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando aplicativo de streaming de áudio");

        // Usuários
        UsuarioGratuito userG = new UsuarioGratuito(1, "Maripulsa", "Maripulsa@gmail.com", true);
        UsuarioPremium userP = new UsuarioPremium(2, "Deusarina ", "Deusarina@yahoo.com", 19.90);

        userG.exibirInfo();
        userP.exibirInfo();

        // Criando álbuns
        AlbumPlaylist album1 = new AlbumPlaylist("Djavan - Coisa de Acender", 1986);
        AlbumPlaylist album2 = new AlbumPlaylist("System of a Down - Toxicity", 2001);

        album1.addMusica("Oceano");
        album1.addMusica("Flor de Lis");
        album2.addMusica("Chop Suey!");
        album2.addMusica("Toxicity");

        // Criando músicas
        Musica m1 = new Musica(1, "Oceano", 5.0, "Djavan", album1);
        Musica m2 = new Musica(2, "Chop Suey!", 3.5, "System of a Down", album2);

        // Exibir álbuns
        album1.exibirInfo();
        album2.exibirInfo();

        // Simulando usuários ouvindo músicas
        userG.ouvirMusica(m1.getTitulo());
        userP.ouvirMusica(m2.getTitulo());

        // Pagamento
        Pagamentos p = new Pagamentos("Cartão de Crédito", 19.90);
        p.processar();

        System.out.println("Aplicativo encerrado com sucesso!");
    }
}
