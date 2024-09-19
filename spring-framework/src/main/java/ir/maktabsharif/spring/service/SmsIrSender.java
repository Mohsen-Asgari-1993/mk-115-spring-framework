package ir.maktabsharif.spring.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(value = SmsIrSender.BEAN_NAME)
public class SmsIrSender implements SmsSender {

    @Value("${sms.sms-ir.username:my-username}")
    private String username;

    @Value("${sms.sms-ir.password:my-password}")
    private String password;

    public static final String BEAN_NAME = "SmsIrSender";

    @Override
    public void send(String mobile, String content) {
        System.out.println("send sms by sms.ir");
        System.out.println("username: " + username);
        System.out.println("password: " + password);
    }
}
