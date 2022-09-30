package com.anamenezes.lemeviagens.services;

import org.springframework.mail.SimpleMailMessage;

import com.anamenezes.lemeviagens.domain.Cliente;
import com.anamenezes.lemeviagens.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}