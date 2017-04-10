To get started, [fork this repository](https://github.com/TIY-Charlotte-Java/ATM).

## Description

Let's build a pretend ATM!

But first, enjoy this gif of a Seagull trying to steal some food.

![seagull](http://www.comedycentral.co.uk/sites/default/files/styles/image-w-760-scale/public/cc_uk/galleries/large/2014/11/18/seagull-thief-fail.gif?itok=9ILXq0_4)

## Requirements

* Prompt me for my name
  * If I enter nothing, throw an exception
* Prompt me for what I would like to do
  * Options:  1. Check my balance, 2. Withdraw Funds or 3. Cancel
  * If option 1:
    * Print "You have $100" to the screen.
  * If option 2:
    * Print to the console "How much money would you like to withdraw?"
    *    After they put in an amount, print "Here is your $<money> money."
    * Exit the program.
  * If option 3:
    * Print to the console "Thank you and please come again." and exit the program.
  

**HARD MODE**
* After each "Deposit" or "Withdraw" transaction, ask the user if they'd like to make another transaction.

**LUDICROUS MODE**  
* Keep track of the amount of money the person has.
    * Prompt for how much money to withdraw
      * If the amount is greater than what they have, throw an exception
      * If all is well, tell them to please take their money
      * Remove the money from their account
      * Print how much money they have left in their account.
