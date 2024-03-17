package org.api.lec16;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

public class Constant {

  public static void main(String[] args) throws Exception {
    ExecutorService executor = Executors.newFixedThreadPool(2);
    final ThreadLocalRandom generator = ThreadLocalRandom.current();

    for (int i = 1; i <= 5; i++) {
      Future<?> future = executor.submit(() -> initNumber(generator));
      future.get();
    }

    for (int i = 1; i <= 5; i++) {
      executor.submit(Constant::printNumber);
    }

    executor.close();
  }

  private static final ThreadLocal<Integer> randomNumber = new ThreadLocal<>();

  public static void initNumber(RandomGenerator generator) {
    if (randomNumber.get() == null) {
      var num = generator.nextInt(10);
      printWithThread("값 설정 완료", num);
      randomNumber.set(num);
    }
  }

  public static void printNumber() {
    printWithThread("값 확인", randomNumber.get());
  }

  private static void printWithThread(String str, Object obj) {
    System.out.printf("[%s] - %s : %s\n", Thread.currentThread().getName(), str, obj);
  }
}
