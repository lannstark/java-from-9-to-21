package org.api.lec08;

public class Main {
  public static void main(String[] args) {
    String str1 = "A\nBC\nDEF";

    String str2 = "A\n" +
        "BC\n" +
        "DEF";

    String str3 = """
        A
        BC
        DEF
        """;
    System.out.println(str3);
  }
}
