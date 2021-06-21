#Proyecto de pruebas y cargado en Github
 #27/01/2020
 #Jhonatan Medina Blanco
Feature: Registro en la pagina Booking 
 Background: 
 	Given abrir el navegador 
 
	 Scenario Outline: registro 
			And Fill out user name <userNameP> and password <passwordP> 
 
		 Examples: 

		|userNameP			 |passwordP|
	    |JhonatanedinaBlanco |1234567P |
 

	Scenario Outline: login 
 		When Fill out Login user name <userNameP> and password <passwordP> 
 
		Examples: 
 		|userNameP			 |passwordP|
 		|JhonatanedinaBlanco |1234567P |
	