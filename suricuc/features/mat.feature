Feature: Login testme App
@tag1
Scenario Outline: login to testme app with registered username and password
Given signin page
When username is given as "<user>"
And password is given as "<pass>"
Then login
Examples:
|user|pass|
|lalitha|password123|
@tag2
Scenario: User moves to cart without adding item to the cart
Given search headphones
When payment
Then testme app doesnt show cart icon 