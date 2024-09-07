package utilitarios;

import java.io.IOException;

public class Delay {
  public static void por(int segundos) {
    try {
      Thread.sleep(segundos * 1000);
    } catch (InterruptedException e) {
      System.out.println("Erro: " + e);
    }
  }

  public static void congelar() {
    System.out.println("Pressione qualquer tecla para continuar...");
    try {
      System.in.read();
    } catch (IOException ioException) {
      ioException.printStackTrace();
    }
  }
}
