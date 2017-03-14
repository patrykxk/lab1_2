package pl.com.bottega.ecommerce.sales.domain.invoicing.Taxes;

import pl.com.bottega.ecommerce.sharedkernel.Money;

public class Context {
    private TaxStrategy taxStrategy;

    public Context(TaxStrategy taxStrategy){
        this.taxStrategy = taxStrategy;
    }
    public Tax executeStrategy(Money net){
        return taxStrategy.calculateTax(net);
    }
}
