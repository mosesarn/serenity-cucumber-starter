Feature: Market Overview

  Rule : Should show all key US Markets.
    Example:  trudy consults today's market indexes
      Given Trudy is on the homepage
      When she consults the markets overview
      Then she would see the summary data for:
        |Dow	|
        |Nasdaq	|
        |S&P	|
