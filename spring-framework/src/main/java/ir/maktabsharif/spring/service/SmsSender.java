package ir.maktabsharif.spring.service;

public interface SmsSender {

    void send(String mobile, String content);
}
