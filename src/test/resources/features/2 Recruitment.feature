#Proyecto de pruebas y cargado en Github
#10/09/202
#Elkin Diaz CH
Feature: validar Recruitment

  @Regresion
    @HU002
  Scenario Outline: Add Candidate
    Given abrir el navegador
    And el usuario diligenica usuario <userName> diligencia password <password>
    When el usuario ingresa add Candidate diligencia el formulario <firstName> <middle> <lastName> <Email>

    Examples:
      | userName | password | firstName | middle | lastName | Email |
      | Admin    | admin123 | Elkin     | Andres | Diaz     | turok@gmail.com |
