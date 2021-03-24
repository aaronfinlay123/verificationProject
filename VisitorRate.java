package cm;

import java.math.BigDecimal;

class VisitorRate implements IReductionRates
{
    @Override
    public BigDecimal reduction(BigDecimal cost) {
        BigDecimal visitorFreeAmt = new BigDecimal("8");
        BigDecimal visitorRedAmt = nesw BigDecimal("0.50");
        if (cost.compareTo(visitorFreeAmt) == -1)
        {
            return BigDecimal.ZERO;
        }
        else return ((cost.subtract(visitorFreeAmt)).multiply(visitorFreeAmt));

    }
}
