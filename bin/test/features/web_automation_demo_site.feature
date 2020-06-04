#Autor: 
@Stories
Feature: Web Automation Demo Site
  Descripcion aqui
  @scenario1
  Scenario: Registro de doctor nuevo
    Given que Carlos necesita registrar un nuevo doctor
    When el realiza el registro del mismo en el aplicativo de Administracion de Hospitales
    Then El verifica que se presente en pantalla el mensaje Datos guardados correctamente
    
  @scenario2
  Scenario: Registro de paciente nuevo
    Given que Carlos necesita registrar un paciente nuevo
    When el realiza el registro del mismo en el aplicativo de administracion de Hospitales
    Then El verifica que se presente en la pantalla el mensaje Datos guardados correctamente
    
  @scenario3
  Scenario: Registro cita nueva
    Given que Carlos necesita asistir al medico
    When el realiza el agendamiento de una cita
    Then El verifica que se presente en pantalla mensaje de Datos guardados correctamente
    
 