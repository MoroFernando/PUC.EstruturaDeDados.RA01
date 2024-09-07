import atendimento.Atendimento;
import atendimento.FilaDeAtendimentos;
import cliente.Cliente;
import historico.PilhaDeHistoricos;

public class App {
    public static void main(String[] args) throws Exception {
      FilaDeAtendimentos fila = FilaDeAtendimentos.getFila();
      PilhaDeHistoricos historico = PilhaDeHistoricos.getHistorico();

      historico.imprime();
      System.out.println("");

      Cliente cliente1 = new Cliente("1", "Nicolas");
      Cliente cliente2 = new Cliente("2", "Fernando");
      Cliente cliente3 = new Cliente("3", "Rafaela");

      Atendimento atendimento1 = new Atendimento("AT001", cliente1, "Emergência");
      Atendimento atendimento2 = new Atendimento("AT002", cliente2, "Entrega");
      Atendimento atendimento3 = new Atendimento("AT003", cliente3, "Dúvida");
      
      fila.adicionar(atendimento1);
      fila.adicionar(atendimento2);
      fila.adicionar(atendimento3);

      fila.imprimeFila();
      System.out.println(" ");

      fila.atende();
      fila.atende();

      historico.imprime();
      historico.remover();
    }
}
