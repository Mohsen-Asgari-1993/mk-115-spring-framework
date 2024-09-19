package ir.maktabsharif.spring.service;

import org.springframework.stereotype.Component;

@Component(MeliPayamakSender.BEAN_NAME)
//@Primary
public class MeliPayamakSender implements SmsSender {

    public static final String BEAN_NAME = "MeliPayamakSender";

    @Override
    public void send(String mobile, String content) {
        System.out.println("send sms by meli payamak");
    }
}
