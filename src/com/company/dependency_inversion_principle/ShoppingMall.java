package com.company.dependency_inversion_principle;

public class ShoppingMall {

    private BankCard bankCard;


    public ShoppingMall(BankCard bankCard){
        this.bankCard = bankCard;
    }


    public void doPurchaseSomething(long amount){
        bankCard.doTransactions(amount);
    }

    public static void main(String[] args) {
        BankCard bankCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.doPurchaseSomething(1251);
    }
}
