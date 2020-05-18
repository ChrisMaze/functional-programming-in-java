package com.tw.fp;

import java.math.BigDecimal;

public class Tax {
  private static BigDecimal rate;

  Tax(String rateString) {
    rate = new BigDecimal(rateString);
  }

  public static BigDecimal applyTax(BigDecimal amount) {
    var tax = amount.multiply(rate);
    return amount.add(tax);
  }
}
