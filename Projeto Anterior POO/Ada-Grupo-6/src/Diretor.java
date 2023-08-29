import java.util.ArrayList;

public class Diretor extends Pessoa {

    private ArrayList<Filme> filmes = new ArrayList<Filme>();

    public Diretor(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    public void setFilme(Filme filme) {
        this.filmes.add(filme);
    }

    @Override
    public String toString() {
        return nome + ", " + idade + " anos.";
    }
}
