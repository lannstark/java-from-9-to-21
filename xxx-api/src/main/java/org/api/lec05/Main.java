package org.api.lec05;

public class Main {
  public static void main(String[] args) throws Exception {
    CoffeeSubscriber subscriber = new CoffeeSubscriber();
    CoffeePublisher publisher = new CoffeePublisher();

    publisher.subscribe(subscriber);

    Thread.sleep(5_000L);
  }
}
