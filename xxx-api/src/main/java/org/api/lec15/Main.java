package org.api.lec15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

  public static void main(String[] args) throws Exception {
    Thread t = Thread.ofVirtual()
        .start(() -> printlnWithThread("Hello, Virtual Thread"));
    t.join();

    Thread t2 = Thread.startVirtualThread(() -> System.out.println("ABC"));

    try (ExecutorService myExecutor = Executors.newVirtualThreadPerTaskExecutor()) {
      Future<?> future = myExecutor.submit(() -> printlnWithThread("Hello, Virtual Thread"));
      future.get();
    }
  }


  public static void threadExample02() throws Exception {
    try (ExecutorService executorService = Executors.newFixedThreadPool(2)) {
      for (int i = 0; i < 3; i++) {
        int threadNum = i + 1;
        executorService.submit(() -> printlnWithThread(String.format("스레드 %s번 실행", threadNum)));
      }
    }

    // 스레드 풀에 제출된 코드가 모두 실행될 때까지 기다리기 위해 5초간 대기한다!
    Thread.sleep(5_000L);
  }

  public static void threadExample01() throws Exception {
    for (int i = 0; i < 3; i++) {
      int threadNum = i + 1;
      Thread t = new Thread() {
        @Override
        public void run() {
          printlnWithThread(String.format("스레드 %s번 실행", threadNum));
        }
      };
      t.start();
    }

    // 우리가 만든 3개의 스레드가 실행될 때까지 기다리기 위해 5초간 대기한다!
    Thread.sleep(5_000L);
  }

  private static void printlnWithThread(Object obj) {
    System.out.printf("[%s] %s\n", Thread.currentThread().getName(), obj);
  }
}
