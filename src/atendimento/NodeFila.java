package atendimento;

public class NodeFila {
  private Atendimento atendimento;
  private NodeFila proximo;
  private NodeFila anterior;

  public NodeFila(Atendimento atendimento) {
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

  public void setProximo(NodeFila proximo) {
    this.proximo = proximo;
  }

  public NodeFila getProximo() {
    return this.proximo;
  }

  public void setAnterior(NodeFila anterior) {
    this.anterior = anterior;
  }

  public NodeFila getAnterior() {
    return this.anterior;
  } 
}
