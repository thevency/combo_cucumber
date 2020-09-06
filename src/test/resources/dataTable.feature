Feature: Get Data From Data Table
  Scenario Outline: Data Table - Smi buy fruits
    Given Smi comes to Fruit shop
    When Smi buys <numberOfApples> apples with price as 1 dollar per apple
    And Smi buys <numberOfOrange> oranges with price as 3.5 dollar per orange
    Then Smi pays for <total> dollars
    Examples:
      | numberOfApples |numberOfOrange   | total   |
      | 1              | 1               | 4.5     |
      | 10             | 10              | 45    |