package com.example.WebAoDai.service;

public interface EmailSenderService {
    void sendEmail(String to, String subject, String message);
}
