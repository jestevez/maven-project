package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * Greet.
   *
   * @param someone the someone
   * @return the string
   */
   public final String greet(final String someone) {
      return String.format("Hello, %s!", someone);
   }
}
