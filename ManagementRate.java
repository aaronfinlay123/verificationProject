package cm;
import java.math.BigDecimal;

class ManagementRate implements IReductionRates
{
    @Override
    public BigDecimal reduction(BigDecimal cost)
    {
        BigDecimal ManagementMinPay = new BigDecimal("3");
        if (cost.compareTo(ManagementMinPay) == -1)
        {
            return ManagementMinPay;
        }

        else
        {
            return cost;
        }
    }
}
