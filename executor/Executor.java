import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import org.graalvm.polyglot.*;

class Executor {
  public static void main(String[] args) {
    try {
      StringBuffer text = new StringBuffer();
      BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("./index.js"), StandardCharsets.UTF_8));
      String line;
      while ((line = reader.readLine()) != null) {
        text.append(line);
        text.append("\n");
      }
      reader.close();

      Context polyglot = Context.create();
      polyglot.eval("js", text.toString());
    } catch (Exception e) {
      return;
    }
  }
}