package pl.com.bottega.ecommerce.sales.domain.invoicing.Taxes;

import pl.com.bottega.ecommerce.sharedkernel.Money;

import java.math.BigDecimal;

/**
 * Created by Patryk on 2017-03-14.
 */
public interface TaxStrategy {
    public Tax calculateTax(Money net);
}
