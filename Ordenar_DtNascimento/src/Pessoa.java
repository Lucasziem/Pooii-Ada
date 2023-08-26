import java.time.LocalDate;
import java.time.Period;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;

    private LocalDate dataDeNascimento;

    public Pessoa(String nome, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", idade=" + getIdade() + " anos" +
                '}';
    }

    public int getIdade() {
        return Period.between(dataDeNascimento, LocalDate.now()).getYears();
    }

    // Fazer a classe Pessoa ser ordenada pelos nomes das pessoas
    // Fazer a classe Pessoa ser ordenada das pessoas mais novas para as mais velhas
    @Override
    public int compareTo(Pessoa pessoaAComparar) {
        Integer idade = getIdade();
        return idade.compareTo(pessoaAComparar.getIdade());
    }
}
