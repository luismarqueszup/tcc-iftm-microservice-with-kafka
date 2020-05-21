package br.com.send.contract;

import br.com.send.domain.NewOrder;
import org.springframework.stereotype.Service;

@Service
public interface SendService {

    public void processSend(NewOrder newOrder);
}
