package multi.threading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadCounterTest {

  @Test
  void checkSumTest() {
    BadCounter badCounter = new BadCounter();
    badCounter.runCalculationsInParallel();
    assertEquals(750, badCounter.getCounter());
  }
}