package atendimento;

import cliente.Cliente;
import utilitarios.Id;

public class Atendimento {
  private String id;
  private Cliente cliente;
  private String motivo; 

  public Atendimento(Cliente cliente, String motivo) {
    this.id = "AT-" + Id.gerar();
    this.cliente = cliente;
    this.motivo = motivo;
  }

  public String getId() {
    return id;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public String getMotivo() {
    return motivo;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public void setMotivo(String motivo) {
    this.motivo = motivo;
  }
}
