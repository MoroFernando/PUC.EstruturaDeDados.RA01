public class FilaDeAtendimentos {
  private NodeFila primeiro;

  public FilaDeAtendimentos() {
    primeiro = null;
  }

  public boolean vazia() {
    return this.primeiro == null;
  }

  public void adicionar(String id, Cliente cliente, String motivo) {
    Atendimento novoAtendimeto = new Atendimento(id, cliente, motivo);
    NodeFila novoNode = new NodeFila(novoAtendimeto);
    

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

  public void imprimeFila(){
    if (vazia()) {
      System.out.println("FILA VAZIA");
      return;
    }

    NodeFila atual = this.primeiro;
    while(atual != null) {
      System.out.println("-> " + atual.getAtendimento().getId() + " " + atual.getAtendimento().getCliente().getNome() + " " + atual.getAtendimento().getMotivo());
      atual = atual.getAnterior();
    }

  }

  public void imprimeAtendimento(){
    System.out.println("-> " + this.primeiro.getAtendimento().getId() + " " + this.primeiro.getAtendimento().getCliente().getNome() + " " + this.primeiro.getAtendimento().getMotivo());
  }

  public void atende(){
    if(vazia()){
      System.out.println("FILA VAZIA");
      return;
    }

    System.out.print("ATENDENDO");
    imprimeAtendimento();

    this.primeiro = this.primeiro.getAnterior();

    // ? IMPLEMENTAR SALVAR NO HISTORICO
  }
}
