package cm;

import java.math.BigDecimal;

interface IReductionRates
{
    BigDecimal reduction(BigDecimal cost);
}