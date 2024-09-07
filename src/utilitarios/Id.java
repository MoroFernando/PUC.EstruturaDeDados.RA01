package utilitarios;

import java.util.Random;

public class Id {
  private static final Random random = new Random();

  public static String gerar() {
    return String.valueOf(random.nextInt(101));
  }
}
