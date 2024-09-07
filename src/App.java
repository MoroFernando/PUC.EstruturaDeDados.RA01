import java.util.Scanner;

import atendimento.Atendimento;
import atendimento.FilaDeAtendimentos;
import cliente.Cliente;
import historico.PilhaDeHistoricos;
import utilitarios.Delay;

public class App {
    public static void main(String[] args) throws Exception {
      FilaDeAtendimentos fila = FilaDeAtendimentos.getFila();
      PilhaDeHistoricos historico = PilhaDeHistoricos.getHistorico();

      Cliente cliente1 = new Cliente("Nicolas");
      Cliente cliente2 = new Cliente("Fernando");
      Cliente cliente3 = new Cliente("Rafaela");
      Cliente cliente4 = new Cliente("Maria");
      Cliente cliente5 = new Cliente("João");
      Cliente cliente6 = new Cliente("Ana");
      Cliente cliente7 = new Cliente("Pedro");
      Cliente cliente8 = new Cliente("Mariana");
      Cliente cliente9 = new Cliente("Lucas");
      Cliente cliente10 = new Cliente("Carolina");

      Atendimento atendimento1 = new Atendimento(cliente1, "Emergência");
      Atendimento atendimento2 = new Atendimento(cliente2, "Entrega");
      Atendimento atendimento3 = new Atendimento(cliente3, "Dúvida");
      Atendimento atendimento4 = new Atendimento(cliente4, "Pagamento");
      Atendimento atendimento5 = new Atendimento(cliente5, "Reclamação");
      Atendimento atendimento6 = new Atendimento(cliente6, "Troca");
      Atendimento atendimento7 = new Atendimento(cliente7, "Informação");
      Atendimento atendimento8 = new Atendimento(cliente8, "Sugestão");
      Atendimento atendimento9 = new Atendimento(cliente9, "Cancelamento");
      Atendimento atendimento10 = new Atendimento(cliente10, "Agendamento");

      fila.adicionar(atendimento1);
      fila.adicionar(atendimento2);
      fila.adicionar(atendimento3);
      fila.adicionar(atendimento4);
      fila.adicionar(atendimento5);
      fila.adicionar(atendimento6);
      fila.adicionar(atendimento7);
      fila.adicionar(atendimento8);
      fila.adicionar(atendimento9);
      fila.adicionar(atendimento10);

      fila.imprime();
      fila.atende();
      fila.atende();
      fila.atende();

      
      Scanner sc = new Scanner(System.in);
      boolean sair = false;
      while (!sair) {
        System.out.println("\nMENU DE OPÇÕES: \n");
        System.out.println("1 - Atender próximo cliente");
        System.out.println("2 - Adicionar cliente na fila");
        System.out.println("3 - Imprimir fila de atendimentos");
        System.out.println("4 - Imprimir histórico de atendimentos");
        System.out.println("0 - Sair");
        System.out.print("\nDigite a opção desejada: ");

        try {
          int opcaoMenu = sc.nextInt();
          switch (opcaoMenu) {
            case 1:
              System.out.println("\nAtendendo próximo cliente...");
              fila.atende();
              Delay.congelar();
              break;
            case 2:
              System.out.print("Digite o nome do cliente: ");
              String nome = sc.next();

              System.out.print("Digite o motivo do atendimento: ");
              String motivo = sc.next();

              Cliente cliente = new Cliente(nome);
              Atendimento atendimento = new Atendimento(cliente, motivo);
              fila.adicionar(atendimento);
              System.out.println("\n" + nome + " adicionado na fila!");

              Delay.congelar();
              break;
            case 3:
              fila.imprime();
              Delay.congelar();
              break;
            case 4:
              historico.imprime();
              Delay.congelar();
              break;
            case 0:
              System.out.println("\nSaindo do sistema...");
              sair = true;
              break;
            default:
              System.out.println("\nOpção inválida!");
              break;
          }
        } catch (Exception e) {
          System.out.println("\nOpção inválida!");
          sc.next();
        }
      }
      sc.close();
    }
}
