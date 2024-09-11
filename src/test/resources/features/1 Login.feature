#Proyecto de pruebas y cargado en Github
#10/09/202
#Elkin Diaz CH
Feature: como usuario valido login

	@Regresion
		@HU001
	Scenario Outline: Login exitoso
		Given abrir el navegador
		When el usuario diligenica usuario <userName> diligencia password <password>

		Examples:
			| userName | password |
			| Admin    | admin123 |
