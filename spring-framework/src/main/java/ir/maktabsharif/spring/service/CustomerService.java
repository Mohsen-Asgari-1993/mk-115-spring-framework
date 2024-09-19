package ir.maktabsharif.spring.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    private final SmsSender smsIrSender;
    private final SmsSender meliPayamak;

    public CustomerService(@Qualifier(SmsIrSender.BEAN_NAME) SmsSender smsIrSender,
                           @Qualifier(MeliPayamakSender.BEAN_NAME) SmsSender meliPayamak) {
        this.smsIrSender = smsIrSender;
        this.meliPayamak = meliPayamak;
    }
}
