Feature: My Cakes

  Scenario: a few cakes
    Given I have 42 cakes in my belly
    When I eat 2 cakes
    Then I should left with 40 cakes

  Scenario: I have few less cakes
    Given I have 100 cakes in my belly
    When I eat 50 cakes
    Then I should left with 50 cakes

  Scenario: Same number of cakes
    Given I have 42 cakes in my belly
    Then I should left with 42 cakes


#  Scenario: Correct non-zero number of books found by author by map
#    Given I have the following books in the store by map
#      | title                                | author      |
#      | The Devil in the White City          | Erik Larson |
#      | The Lion, the Witch and the Wardrobe | C.S. Lewis  |
#      | In the Garden of Beasts              | Erik Larson |
#    When I search for books by author Erik Larson
#    Then I find 2 books

#    Scenario:
#        Feature: Visit career guide page in career.guru99.com
#        Scenario: Visit career.guru99.com
#        Given : 3
#        When : imsidmia
#        And :
#
#
#        When: I click on career guide menu
#        Then: I should see career guide page

