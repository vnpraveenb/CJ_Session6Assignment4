# CJ_Session6Assignment4

Problem Statement:
Create a class BankAtm with following properties and methods-
Properties: atmId; bankName;location; balance
Methods: withdraw(double amt) deposit(double amt)

The withdraw method should check the available balance in the ATM before deducting the amount from the balance. If the balance is less than 10000 the withdrawal should not be allowed and a user-defined exception
BankATMException should be thrown. The withdrawal should also not be allowed if the amount to be withdrawn is greater than balance.


Create a user defined exception class BankATMException class that will be created whenever withdrawal is done for balance less than 10000. Create an application Bank having 3 BankAtm objects.
Every time withdraw method is called on the BankAtm object the balance should be subtracted.

Expected Output:
Generating BankATMException whenever withdrawal is done for balance less than 10000.
