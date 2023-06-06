/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package multi.threading;

import lombok.SneakyThrows;

public class BadCounter {

  private int counter = 0;

  public int getCounter() {
    return counter;
  }

  Runnable runnable = new Runnable() {
    @Override
    public void run() {
      for (int i = 0; i < 5; i++) {
        counter++;
        System.out.println(Thread.currentThread().getName() + " Counter " + counter);
      }
    }
  };

  @SneakyThrows
  public void runCalculationsInParallel() {

    for (int j = 0; j < 150; j++) {
      Thread t = new Thread(this.runnable);
      t.setName("T " + j);
      t.start();
    }
  }
}