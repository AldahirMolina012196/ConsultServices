Feature: Consult Services
  I as a user of the system required consult the services section to be clear about the information that is offered.

  Background: Initial flow
    Given Advance to Services

  @Smoke_Test
  Scenario: Initial load of the application
    Then Verify the existence section Services

  @Verify_Capabilities
  Scenario: It is verified that the Capabilities section is displayed
    When The capabilities icon is selected 1
    Then Verify title section capabilities number 1  and Capacidades de Pruebas de software Centradas en el negocio

  @Verify_How_do_we_do_it
  Scenario: It is verified that the How we do it section is displayed
    When The section of how we do it is selected 2
    Then Verify title section how we do it number 2 and lo hacemos

  @Verify_Briefcase
  Scenario: The solutions portfolio section is verified
    When Solutions portfolio is selected 3
    Then Verify title section Portfolio of solutions number 3 and Portafolio de soluciones de testing centradas en su negocio

  @Verify_Digital
  Scenario: It is verified that the Digital performance Monitoring section is displayed
    When Digital performance is select
    Then Verify title section priority DIGITAL PERFORMANCE MANAGMENT

  @Data_Formulary
  Scenario: Validate data submission in the courses and certifications form
    When The data is entered into the courses and certifications form
      | name    | lastName         | city     | numberPhone | email                    | business      | message                                                   |
      | Aldahir | Molina Velasquez | Medellin | 3104533888  | amv.choucair@testing.com | independiente | Testing choucair for certification analyst Aldahir Molina |
    Then Send message is validated




