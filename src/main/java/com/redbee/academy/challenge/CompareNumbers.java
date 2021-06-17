package com.redbee.academy.challenge;

public class CompareNumbers {

  /**
   * Method that receives three numbers and returns the
   * max
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @param c - Another Integer Number
   * @return The max of a, b and c
   */
  public static Integer max(Integer a, Integer b, Integer c) {
    Integer result = nullSafeMax(a, b);
    result = nullSafeMax(result, c);
    return result;
  }

  private static Integer nullSafeMax(Integer a, Integer b) {
    if (a != null && b != null) {
      return Math.max(a, b);
    } else if (a != null) {
      return a;
    } else {
      return b;
    }
  }
}

