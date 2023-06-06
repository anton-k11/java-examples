package multi.threading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadCounterTest {

  @Test
  void sumUpTo150() {
    BadCounter badCounter = new BadCounter();
    badCounter.sumUpTo150();
    assertEquals(150, badCounter.getCounter());
  }
}