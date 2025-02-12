package com.previsaotempo.notification;

import com.previsaotempo.dto.AlertaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService {

    @Autowired
    private JavaMailSender mailSender;

    public void enviarAlerta(AlertaDTO alerta) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(alerta.getDestinatario());
        message.setSubject("Alerta Meteorológico: " + alerta.getTipo());
        message.setText(alerta.getMensagem());
        mailSender.send(message);
    }
}