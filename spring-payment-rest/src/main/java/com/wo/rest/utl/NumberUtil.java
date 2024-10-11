package com.wo.rest.utl;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NumberUtil {

    public static double roundToTwoDecimals(double value) {
        return BigDecimal.valueOf(value)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
    }

}
