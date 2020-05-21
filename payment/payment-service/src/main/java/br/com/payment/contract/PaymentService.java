package br.com.payment.contract;

import br.com.payment.domain.NewOrder;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {

    void processPayment(NewOrder newOrder);
}
