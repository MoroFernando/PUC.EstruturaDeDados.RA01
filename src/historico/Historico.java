package historico;

import atendimento.Atendimento;

public class Historico {
  private String id;
  private Atendimento atendimento;
  private String data;

  public Historico(String id, Atendimento atendimento, String data) {
    this.id = id;
    this.atendimento = atendimento;
    this.data = data;
  }

  public String getId() {
    return id;
  }

  public Atendimento getAtendimento() {
    return atendimento;
  }

  public void setAtendimento(Atendimento atendimento) {
    this.atendimento = atendimento;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  
}
