package com.credit.card.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.credit.card.Proccessor.CreditCardProccessor;

@RestController

public class CreditCardController {	

	CreditCardProccessor llamarProccessor = new CreditCardProccessor();
	String tarjeta = "";

	@GetMapping(path="creditcards/profile")
	public String obtenerTarjeta(@RequestParam(value = "preferencias", required = true) String preferencias, @RequestParam(value = "salario", required = true)double salario, @RequestParam(value = "edad", required = true)int edad) {
		
		
		tarjeta =  llamarProccessor.evaluarPreferencias(preferencias,salario,edad);

		return "Tarjeta recomendada para el cliente: " + tarjeta;
	}

}
