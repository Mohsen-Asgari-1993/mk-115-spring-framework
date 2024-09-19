package ir.maktabsharif.spring.service;

import org.springframework.stereotype.Component;

@Component(value = SmsIrSender.BEAN_NAME)
public class SmsIrSender implements SmsSender {

    public static final String BEAN_NAME = "SmsIrSender";

    @Override
    public void send(String mobile, String content) {
        System.out.println("send sms by sms.ir");
    }
}
