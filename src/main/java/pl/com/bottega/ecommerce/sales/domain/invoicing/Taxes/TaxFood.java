package pl.com.bottega.ecommerce.sales.domain.invoicing.Taxes;

import pl.com.bottega.ecommerce.sharedkernel.Money;

import java.math.BigDecimal;

/**
 * Created by Patryk on 2017-03-14.
 */
public class TaxFood implements TaxStrategy {
    private BigDecimal ratio;
    private String desc;
    public Tax calculateTax(Money net) {
        ratio = BigDecimal.valueOf(0.07);
        desc = "7% (F)";
        Money taxValue = net.multiplyBy(ratio);

        return new Tax(taxValue, desc);
    }
}
