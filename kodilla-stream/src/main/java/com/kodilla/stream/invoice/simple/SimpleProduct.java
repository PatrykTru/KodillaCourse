package com.kodilla.stream.invoice.simple;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@AllArgsConstructor
@Getter
public final class SimpleProduct {
    private final String productName;
    private final double productPrice;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleProduct that = (SimpleProduct) o;
        return Objects.equals(productName, that.productName);
    }


}
