package com.tw.fp;

import java.math.BigDecimal;

public class Discount {
  public static BigDecimal rate;

  public Discount(String rate) {
    Discount.rate = new BigDecimal(rate);
  }

  public static BigDecimal applyDiscount(BigDecimal amount) {
    var discount = amount.multiply(rate);
    return amount.add(discount.negate());
  }
}
