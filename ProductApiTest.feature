Feature: FakeStoreAPI - Product API tests

  Background:
    * url 'https://fakestoreapi.com'

  Scenario: Get all products
    Given path 'products'
    When method GET
    Then status 200
    And match response == '#[]'



