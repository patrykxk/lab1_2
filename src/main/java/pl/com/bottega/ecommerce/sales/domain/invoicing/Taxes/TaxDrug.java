package pl.com.bottega.ecommerce.sales.domain.invoicing.Taxes;

import pl.com.bottega.ecommerce.sharedkernel.Money;
import java.math.BigDecimal;

public class TaxDrug implements TaxStrategy{
    private BigDecimal ratio;
    private String desc;
    public Tax calculateTax(Money net) {
        ratio = BigDecimal.valueOf(0.05);
        desc = "5% (D)";
        Money taxValue = net.multiplyBy(ratio);

        return new Tax(taxValue, desc);
    }
}