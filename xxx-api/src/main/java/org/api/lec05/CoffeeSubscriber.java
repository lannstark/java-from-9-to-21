package org.api.lec05;

import java.util.concurrent.Flow;

public class CoffeeSubscriber implements Flow.Subscriber<String> {
  private Flow.Subscription subscription;
  private int coffeeCount = 0;

  @Override
  public void onSubscribe(Flow.Subscription subscription) {
    this.subscription = subscription;
    subscription.request(1L);
  }

  @Override
  public void onNext(String item) {
    System.out.println("수신 : " + item);
    coffeeCount += 1;
    if (coffeeCount < 2) {
      subscription.request(1L);
    }
  }

  @Override
  public void onError(Throwable throwable) {
    System.out.println("에러 발생!");
  }

  @Override
  public void onComplete() {
    System.out.println("더 이상 받을 커피가 없다!");
    subscription.cancel();
  }
}
