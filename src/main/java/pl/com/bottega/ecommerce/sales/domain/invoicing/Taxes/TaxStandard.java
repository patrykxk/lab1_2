package pl.com.bottega.ecommerce.sales.domain.invoicing.Taxes;

import pl.com.bottega.ecommerce.sharedkernel.Money;

import java.math.BigDecimal;

/**
 * Created by Patryk on 2017-03-14.
 */
public class TaxStandard implements TaxStrategy {
    private BigDecimal ratio;
    private String desc;
    public Tax calculateTax(Money net) {
        ratio = BigDecimal.valueOf(0.23);
        desc = "23%";
        Money taxValue = net.multiplyBy(ratio);

        return new Tax(taxValue, desc);
    }
}
