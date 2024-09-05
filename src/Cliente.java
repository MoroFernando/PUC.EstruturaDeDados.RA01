public class Cliente {
  private String id;
  private String nome;
  private int idade;

  public Cliente(String id, String nome) {
    this.id = id;
    this.nome = nome;
  }

  public String getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
