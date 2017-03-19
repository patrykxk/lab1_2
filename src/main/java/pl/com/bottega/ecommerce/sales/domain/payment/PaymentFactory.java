package pl.com.bottega.ecommerce.sales.domain.payment;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public class PaymentFactory {
    public Payment createPayment(ClientData clientData, Money amount){
        Id id = Id.generate();
        return new Payment(id, clientData, amount.multiplyBy(-1));
    }

}
