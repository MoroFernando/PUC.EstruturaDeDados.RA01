package atendimento;

import historico.PilhaDeHistoricos;

public class FilaDeAtendimentos {
  private static FilaDeAtendimentos fila;
  private NodeFila primeiro;

  private FilaDeAtendimentos() {
    primeiro = null;
  }

  public static FilaDeAtendimentos getFila() {
    if(fila == null) {
      fila = new FilaDeAtendimentos();
    }

    return fila;
  }

  public boolean vazia() {
    return this.primeiro == null;
  }

  public void adicionar(Atendimento atendimento) {
    NodeFila novoNode = new NodeFila(atendimento);
    

    if(vazia()){
      this.primeiro = novoNode;
      return;
    } 

    NodeFila atual = this.primeiro;
    while(atual.getAnterior() != null) {
      atual = atual.getAnterior();
    }

    atual.setAnterior(novoNode);
  }

  public void imprime(){
    System.out.println("\n######## FILA DE ATENDIMENTOS #######");
    if (vazia()) {
      System.out.println("* FILA VAZIA *");
    } else {
      NodeFila atual = this.primeiro;
      while(atual != null) {
        System.out.println("-> " + atual.getAtendimento().getId() + ", " + atual.getAtendimento().getCliente().getNome() + ", " + atual.getAtendimento().getMotivo());
        atual = atual.getAnterior();
      }
    }
    System.out.println("#####################################");
  }

  public void imprimeAtendimento(){
    System.out.println("-> " + this.primeiro.getAtendimento().getId() + ", " + this.primeiro.getAtendimento().getCliente().getNome() + ", " + this.primeiro.getAtendimento().getMotivo());
  }

  public void atende(){
    if(vazia()){
      System.out.println("FILA VAZIA");
      return;
    }

    Atendimento atendimento = this.primeiro.getAtendimento();

    System.out.print("ATENDENDO");
    imprimeAtendimento();

    PilhaDeHistoricos.getHistorico().adicionar(atendimento);
    this.primeiro = this.primeiro.getAnterior();
  }
}
