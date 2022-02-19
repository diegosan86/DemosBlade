#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco
@Regresion
Feature: Registro en la pagina Booking 
	
	@Caso1
	Scenario Outline: scenario description 
		
		Given abrir el navegador
		And cuando diligencie los campos <userName> 
		
		Examples:
			| userName |
			| hola |
			| chao |
	
	@Caso2
	Scenario Outline: scenario description 
		
		Given abrir el navegador
		And cuando diligencie los campos usuario <userName> y contraseña <password> 
		
		Examples:
			| userName | password |
			| Diegosanch | 1234 |