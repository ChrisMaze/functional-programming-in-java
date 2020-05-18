package com.tw.fp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

class CalculatorTest {
  private final Discount discount = new Discount("0.2");
  private final Tax tax = new Tax("0.2");
  private final Calculator calculator = new Calculator(discount, tax);

  @Test
  public void should_return_ () {
    List<BigDecimal> priceList = Arrays.asList(new BigDecimal(100), new BigDecimal(200), new BigDecimal(99));

    String finalPrice = calculator.PriceReport(priceList);

    Assertions.assertEquals("383.04", finalPrice);
  }
}
