package org.example;

import java.util.ArrayList;

public class Factorizer {
  public ArrayList<Integer> primeFactors(Integer n) {
    ArrayList<Integer> factors = new ArrayList<>();

    if (n == null || n <= 1) {
      return factors; // Return empty list for 0, 1, or negative numbers
    }

    int divisor = 2;
    while (n > 1) {
      while (n % divisor == 0) {
        factors.add(divisor);
        n /= divisor;
      }
      divisor++;
    }

    return factors;
  }
}