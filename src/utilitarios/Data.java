package utilitarios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {
  public static String atual() {
    LocalDateTime dataAtual = LocalDateTime.now();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM HH:mm:ss");
    return dataAtual.format(formato);
  }
}
