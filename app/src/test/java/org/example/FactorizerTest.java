package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.ArrayList;

class FactorizerTest {
  @Test
  void itReturnsAnEmptyListForZero() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList<>(), factorizer.primeFactors(0));
  }

  @Test
  void itReturnsAnEmptyListForOne() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList<>(), factorizer.primeFactors(1));
  }

  @Test
  void itReturnsPrimeFactorsForCompositeNumber() {
    Factorizer factorizer = new Factorizer();
    assertEquals(Arrays.asList(3, 3), factorizer.primeFactors(9));
    assertEquals(Arrays.asList(2, 5), factorizer.primeFactors(10));
    assertEquals(Arrays.asList(2, 2, 5, 5), factorizer.primeFactors(100));
  }

  @Test
  void itReturnsItselfForPrimeNumber() {
    Factorizer factorizer = new Factorizer();
    assertEquals(Arrays.asList(17), factorizer.primeFactors(17));
  }
}