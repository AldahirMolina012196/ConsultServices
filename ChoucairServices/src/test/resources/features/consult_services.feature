Feature: Consult Services
  I as a user of the system required consult the services section to be clear about the information that is offered.

  Background: Initial flow
    When Advance to Services

  @Smoke_Test
  Scenario: Initial load of the application
    Then Verify the existence section Services

  @Verify_Capabilities
  Scenario: Capabilities section
    When The capabilities icon is selected 1
    Then Verify title section capabilities number 1  and Capacidades de Pruebas de software Centradas en el negocio

  @Verify_How_do_we_do_it
  Scenario: How do we do it section
    When The section of how we do it is selected 2
    Then Verify title section how we do it number 2 and lo hacemos

  @Verify_Briefcase
  Scenario: Portfolio of solutions section
    When Solutions portfolio is selected 3
    Then Verify title section Portfolio of solutions number 3 and Portafolio de soluciones de testing centradas en su negocio

  @Verify_Digital
  Scenario: Digital performance Monitoring section
    When Digital performance is select
    Then Verify title section priority DIGITAL PERFORMANCE MANAGMENT
