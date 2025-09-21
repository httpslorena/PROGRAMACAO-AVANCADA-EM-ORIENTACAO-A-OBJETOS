public class Usuario {
    protected int id;
    protected String nome;
    protected String email;

    public Usuario(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public void exibirInfo() {
        System.out.println("Usuário: " + nome + " - " + email);
    }

    public String getNome() {
        return nome;
    }
}
