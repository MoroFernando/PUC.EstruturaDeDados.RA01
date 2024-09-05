public class Node {
  private Atendimento atendimento;
  private Node proximo;
  private Node anterior;

  public Node(Atendimento atendimento) {
    this.atendimento = atendimento;
    this.proximo = null;
    this.anterior = null;
  }

  public void setAtendimento(Atendimento atendimento) {
    this.atendimento = atendimento;
  }

  public Atendimento getAtendimento() {
    return this.atendimento;
  }

  public void setProximo(Node proximo) {
    this.proximo = proximo;
  }

  public Node getProximo() {
    return this.proximo;
  }

  public void setAnterior(Node anterior) {
    this.anterior = anterior;
  }

  public Node getAnterior() {
    return this.anterior;
  } 
}
