package cliente;

import utilitarios.Id;

public class Cliente {
  private String id;
  private String nome;

  public Cliente(String nome) {
    this.id = "CLI-" + Id.gerar();
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
