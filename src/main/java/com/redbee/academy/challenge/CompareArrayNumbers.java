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
    var shortest = a.size() < b.size() ? a : b;
    var longer = a.size() > b.size() ? a : b;
    int i;
    for (i = 0; i < shortest.size(); i++) {
      if (a.get(i) > b.get(i)) {
        result.add(a.get(i));
      } else {
        result.add(b.get(i));
      }
    }

    for (int j = i; j < longer.size(); j++) {
      result.add(longer.get(j));
    }
    return result;
  }


}
