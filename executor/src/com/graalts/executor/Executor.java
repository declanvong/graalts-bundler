package com.graalts.executor;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.graalvm.polyglot.*;

class Executor {
  public static void main(String[] args) {
    InputStream resourceStream = ClassLoader.getSystemClassLoader().getResourceAsStream("src/resources/index.js");
    if (resourceStream == null) {
      System.out.println("Could not find bundled JS");
      return;
    }
    try {
      StringBuffer text = new StringBuffer();
      BufferedReader reader = new BufferedReader(new InputStreamReader(resourceStream));
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
