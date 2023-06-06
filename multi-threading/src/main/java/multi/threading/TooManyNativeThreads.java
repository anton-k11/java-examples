package multi.threading;

import java.time.Duration;

public class TooManyNativeThreads {
  public static void main(String[] args) {
    for (int i = 0; i < 100_000; i++) {
      new Thread(() -> {
        try {
          Thread.sleep(Duration.ofMinutes(1L).toMillis());
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }).start();
    }
  }
}
