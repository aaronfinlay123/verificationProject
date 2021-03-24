package cm;

import java.math.BigDecimal;

class StudentRate implements IReductionRates
{
//s
    @Override
    public BigDecimal reduction(BigDecimal cost)
    {
        //not reduced amount for student
        BigDecimal studNotReduceAmount = new BigDecimal("5.50");
        BigDecimal studReductionAmount = new BigDecimal("0.25");

        if (cost.compareTo(studNotReduceAmount) <= 0) return cost;
        else return ((cost.subtract(studNotReduceAmount)
                    .multiply(studReductionAmount).add(studNotReduceAmount)));
    }
}
