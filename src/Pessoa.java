import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {

  private String nome;
  private String genero;

  public Pessoa(String nome2, String sexo) {

  }

  public String getNome() {
    return nome;
  }

  public String getSexo() {
    return genero;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setSexo(String sexo) {
    this.genero = sexo;
  }

  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Pessoa pessoa = (Pessoa) o;
    return Objects.equals(nome, pessoa.nome) && Objects.equals(genero, pessoa.genero);
  }

  public int hashCode() {
    return Objects.hash(nome, genero);
  }

  public String toString() {
    return this.nome + " - " + this.genero;
  }

  public int compareTo(Pessoa pessoa) {
    return this.nome.compareTo(pessoa.getNome());
  }
}
