package com.tw.fp;

import java.math.BigDecimal;
import java.util.List;

public class Calculator {
  private Discount discount;
  private Tax tax;

  public Calculator(Discount discount, Tax tax) {
    this.discount = discount;
    this.tax = tax;
  }

  public String PriceReport(List<BigDecimal> priceList) {
    return priceList.stream()
        .peek(price -> {
          if (price.compareTo(new BigDecimal(100)) < 0) {
            System.out.println("This is cheap enough!!!");
          }
        })
        .map(Discount::applyDiscount)
        .map(Tax::applyTax)
        .reduce((price, total) -> total = total.add(price)).orElseThrow().toString();
  }
}
