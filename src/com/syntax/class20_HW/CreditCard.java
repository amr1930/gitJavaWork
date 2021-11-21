package com.syntax.class20_HW;

public class CreditCard {
    /* Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.*/


    double balance;
    double interest;

    public void calcInterest(double balance,double interest){
        interest=(balance * interest) /100;
        System.out.println(interest);
    }
}
class Visa extends CreditCard{

}

class AX extends CreditCard {
@Override
public void calcInterest(double balance,double interest){
    interest=(balance * interest) /100;
    System.out.println(interest);
}

}
class CreditCardTester{
public static void main(String[]args) {
    CreditCard a = new CreditCard();
    a.calcInterest(3000,1.5);
    Visa b=new Visa();
    b.calcInterest(5000,2);
    AX c=new AX();
    c.calcInterest(10000,3);

}
}