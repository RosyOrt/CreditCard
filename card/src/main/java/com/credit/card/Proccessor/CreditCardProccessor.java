package com.credit.card.Proccessor;

import com.credit.card.exception.NoCoincidenceException;

public class CreditCardProccessor {

	String tarjeta = "";


	public String evaluarPreferencias(String pref, Double salario, int edad) {
		if (pref.equals("Shopping")){
			tarjeta = evaluarSalarioShopping(salario, edad);
		}else if (pref.equals("Travels")){
			tarjeta = evaluarSalarioTravels(salario, edad);
		}else if (pref.equals("Help")){
			tarjeta = evaluarSalarioHelp(salario, edad);
		}else if (pref.equals("My bussines")){
			tarjeta = evaluarSalarioBusiness(salario, edad);
		}else if (pref.equals("Sports")){
			tarjeta = evaluarSalarioSports(salario, edad);
		}else if (pref.equals("My style")){
			tarjeta = evaluarSalarioMyStyle(salario, edad);
		}else{
			throw new NoCoincidenceException("No se encontraron coincidencias, intente de nuevo...Gracias!");
		}
		return tarjeta;
	}


	public String evaluarSalarioShopping(Double salario, int edad) {

		if(salario >= 7000.00 && salario <= 14999.00) {

			evaluarMayorEdad(edad);
			
			if(edad >= 18 && edad <= 23) {
				tarjeta = "B*smart, Afinity Card";
			}else if(edad >= 24 && edad <= 32) {
				tarjeta = "B*smart, Clasica, Afinity Card, Office Depot, Costco, Best Buy Banamex, The Home Depot";
			}else if(edad >= 33 && edad <= 75) {
				tarjeta = "Clasica, Office Depot, Costco, Best Buy Banamex, The Home Depot";
			}
		}else if(salario >= 15000.00 && salario <= 34999.00){

			evaluarMayorEdad(edad);
			
			if(edad >= 18 && edad <= 23) {
				tarjeta = "B*smart, Afinity Card";
			}else if(edad >= 24 && edad <= 32) {
				tarjeta = "Oro, Afinity Card, Office Depot, Costco, Best Buy Banamex, The Home Depot";
			}else if(edad >= 33 && edad <= 75) {
				tarjeta = "Oro, Office Depot, Costco, Best Buy Banamex, The Home Depot";
			}
		}else if(salario >= 35000.00 && salario <= 49999.00){
			
			evaluarMayorEdad(edad);
			
			if(edad >= 18 && edad <= 23) {
				tarjeta = "B*smart, Afinity Card";
			}else if(edad >= 24 && edad <= 75) {
				tarjeta = "Platinum, Office Depot, Costco, Best Buy Banamex, The Home Depot";
			}

		}else if(salario >= 50000.00 ){
			
			evaluarMayorEdad(edad);
			
			if(edad >= 18 && edad <= 23) {
				tarjeta = "B*smart, Afinity Card";
			}else if(edad >= 24 && edad <= 75) {
				tarjeta = "Platinum";
			}
		}else {
			throw new NoCoincidenceException("Se requiere salario minimo de $7000 MENSUAL...Gracias!");
		}
		
		return tarjeta;
	}



	public String evaluarSalarioTravels(Double salario, int edad) {

		if(salario >= 12000.00 && salario <= 29999.00) {
			
			evaluarMayorEdad(edad);
			
			if(edad >= 18 && edad <= 75) {
				tarjeta = "citi / AAdvantage";
			}
		}else if(salario >= 30000.00 && salario <= 34999.00){
			
			evaluarMayorEdad(edad);
			
			if(edad >= 18 && edad <= 23) {
				tarjeta = "citi / AAdvantage";
			}else if(edad >= 24 && edad <= 75) {
				tarjeta = "citi / AAdvantage, Platinum";
			}
		}else if(salario >= 35000.00 && salario <= 49999.00){
			
			evaluarMayorEdad(edad);
			
			if(edad >= 18 && edad <= 23) {
				tarjeta = "citi / AAdvantage";
			}else if(edad >= 24 && edad <= 75) {
				tarjeta = "citi / AAdvantage, Platinum";
			}
		}else if(salario >= 50000.00 ){
			
			evaluarMayorEdad(edad);
			
			if(edad >= 18 && edad <= 22) {
				tarjeta = "citi / AAdvantage";
			}else if(edad >= 23 && edad <= 75) {
				tarjeta = "Platinum";
			}
		}else {
			throw new NoCoincidenceException("Se requiere salario minimo de $12000 MENSUAL...Gracias!");
		}
		return tarjeta;
	}


	public String evaluarSalarioHelp(Double salario, int edad) {

		if(salario >= 12000.00 ){
			
			evaluarMayorEdad(edad);
			
			if(edad >= 18 && edad <= 75) {
				tarjeta = "Banamex Teletón, APAC";
			}
		}else {
			throw new NoCoincidenceException("Se requiere salario minimo de $12000 MENSUAL...Gracias!");
		}

		return tarjeta;
	}


	public String evaluarSalarioBusiness(Double salario, int edad) {

		if(salario >= 7000.00 ){
			
			evaluarMayorEdad(edad);
			
			if(edad >= 18 && edad <= 75) {
				tarjeta = "Office Depot, Costco, Best Buy Banamex, The Home Depot";
			}
		}else {
			throw new NoCoincidenceException("Se requiere salario minimo de $7000 MENSUAL...Gracias!");
		}

		return tarjeta;
	}


	public String evaluarSalarioSports(Double salario, int edad) {
	
		
		if(salario >= 7000.00 && salario <= 34999.00) {
			
			evaluarMayorEdad(edad);
			
			if(edad >= 18 && edad <= 75) {
				tarjeta = "Martí Clasica Citibanamex, América Deporteísmo, Pumas Deporteísmo, Toluca Deporteísmo, La verde Deporteísmo";
			}
		}else if(salario >= 35000.00 ){
			
			evaluarMayorEdad(edad);
			
			if(edad >= 18 && edad <= 75) {
				tarjeta = "Martí Premium Citibanamex";
			}
		}else {
			throw new NoCoincidenceException("Se requiere salario minimo de $7000 MENSUAL...Gracias!");
		}
		
		return tarjeta;

	}



	public String evaluarSalarioMyStyle(Double salario, int edad) {

		if(salario >= 7000.00 && salario <= 14999.00) {
			
			evaluarMayorEdad(edad);
			
			if(edad >= 18 && edad <= 32) {
				tarjeta = "B*smart, Afinity Card";
			}else if(edad >= 33 && edad <= 75) {
				tarjeta = "B*smart";
			}
		}else if(salario >= 15000.00 && salario <= 29999.00){
			
			evaluarMayorEdad(edad);
			
			if(edad >= 18 && edad <= 23) {
				tarjeta = "B*smart, Afinity Card";
			}else if(edad >= 24 && edad <= 32) {
				tarjeta = "B*smart, Oro, Afinity Card";
			}else if(edad >= 33 && edad <= 75) {
				tarjeta = "Oro";
			}
		}else if(salario >= 30000.00 && salario <= 34999.00){
			
			evaluarMayorEdad(edad);
			
			if(edad >= 18 && edad <= 23) {
				tarjeta = "B*smart, Oro, Afinity Card";
				
			}else if(edad >= 24 && edad <= 32) {
				tarjeta = "B*smart, Platinum, Afinity Card";
			
			}else if(edad >= 33 && edad <= 75) {
				tarjeta = "Platinum";
			}
		}else if(salario >= 35000.00 ){
			
			evaluarMayorEdad(edad);
			
			if(edad >= 18 && edad <= 23) {
				tarjeta = "B*smart";
			}else if(edad >= 24 && edad <= 75) {
				tarjeta = "B*smart, Platinum";
			}
		}else {
			throw new NoCoincidenceException("Se requiere salario minimo de $7000 MENSUAL...Gracias!");
		}
		
		return tarjeta;
	}
	
	public void evaluarMayorEdad(int edad) {
				
		if(edad <18) {
			throw new NoCoincidenceException("Para adquirir una tarjeta el cliente debe ser mayor de EDAD...Gracias!");
		}
	}

}
