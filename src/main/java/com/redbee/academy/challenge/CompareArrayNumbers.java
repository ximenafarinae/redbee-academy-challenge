package com.redbee.academy.challenge;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static List<Integer> max(List<Integer> a, List<Integer> b) {
    var result = new ArrayList<Integer>();
    result.add(max(a));
    result.add(max(b));
    return result;
  }

  private static Integer max(List<Integer> array) {
    Integer max = 0;
    for (int number : array) {
      if (number > max) {
        max = number;
      }
    }
    return max;
  }


}
