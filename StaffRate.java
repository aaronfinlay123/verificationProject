package cm;
import java.math.BigDecimal;
class StaffRate implements IReductionRates
{
    @Override
    public BigDecimal reduction(BigDecimal cost)
    {
        BigDecimal staffMaxPay = new BigDecimal("16");
        if (cost.compareTo(staffMaxPay) >= 0)
        {
            return staffMaxPay;
        } else
            {
            return cost;
            }
    }
}
