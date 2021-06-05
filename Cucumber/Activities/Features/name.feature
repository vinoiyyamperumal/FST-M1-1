Feature: Place order on the Amazon website.
@SmokeTest
Scenario: Validate if the guest user is able to add a product to cart.
Given user is on the Amazon website
When user searches a product
Then user should be able to view product information related to product searched
And user click on add to cart button
Then user verifies if the product is added to cartd  |