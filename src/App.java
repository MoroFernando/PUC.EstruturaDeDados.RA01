public class App {
    public static void main(String[] args) throws Exception {
      FilaDeAtendimentos fila = new FilaDeAtendimentos();

      Cliente c1 = new Cliente("1", "Nicolas");
      Cliente c2 = new Cliente("2", "Fernando");
      Cliente c3 = new Cliente("3", "Rafaela");

      fila.adicionar("AT001", c1, "Emergência");
      fila.adicionar("AT002", c2, "Entrega");
      fila.adicionar("AT003", c3, "Dúvida");

      fila.imprimeFila();
      System.out.println(" ");
      fila.atende();
      fila.atende();
    }
}
