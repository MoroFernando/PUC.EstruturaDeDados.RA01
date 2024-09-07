package historico;

public class NodeHistorico {
  private Historico historico;
  private NodeHistorico proximo;

  public NodeHistorico(Historico historico) {
    this.historico = historico;
    this.proximo = null;
  }

  public void setHistorico(Historico historico) {
    this.historico = historico;
  }

  public Historico getHistorico() {
    return this.historico;
  }

  public void setProximo(NodeHistorico proximo) {
    this.proximo = proximo;
  }

  public NodeHistorico getProximo() {
    return this.proximo;
  }
}
