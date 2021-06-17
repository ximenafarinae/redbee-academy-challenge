package com.redbee.academy.challenge;

public class SumTwoNumbers {

  /**
   * Method that receives two numbers and returns the
   * sum of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static Integer sum(Integer a, Integer b) {
    return checkNotNull(a) + checkNotNull(b);
  }

  private static Integer checkNotNull(Integer a) {
    if (a != null) {
      return a;
    } else {
      return 0;
    }
  }

}
