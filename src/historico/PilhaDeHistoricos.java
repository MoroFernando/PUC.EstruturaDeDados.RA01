package historico;

import atendimento.Atendimento;
import utilitarios.Data;

public class PilhaDeHistoricos {
  private static PilhaDeHistoricos pilha;
  private NodeHistorico topo;

  private PilhaDeHistoricos() {
    this.topo = null;
  }

  public static PilhaDeHistoricos getHistorico() {
    if (pilha == null) {
      pilha = new PilhaDeHistoricos();
    }
    return pilha;
  }

  public boolean vazia() {
    return this.topo == null;
  }

  public void adicionar(Atendimento atendimento) {
    Historico novoHistorico = new Historico(atendimento.getId(), atendimento, Data.atual());
    NodeHistorico novoNode = new NodeHistorico(novoHistorico);

    novoNode.setProximo(this.topo);
    this.topo = novoNode;
  }

  public void imprime() {
    if (vazia()) {
      System.out.println("HISTÓRICO VAZIO");
      return;
    }

    NodeHistorico atual = this.topo;
    while (atual != null) {
      System.out.println("-> " + atual.getHistorico().getId() + " " + atual.getHistorico().getAtendimento().getCliente().getNome() + " " + atual.getHistorico().getAtendimento().getMotivo() + " " + atual.getHistorico().getData());
      atual = atual.getProximo();
    }

    return;
  }
}
