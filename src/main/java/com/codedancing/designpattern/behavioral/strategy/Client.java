package com.codedancing.designpattern.behavioral.strategy;

import com.codedancing.designpattern.behavioral.strategy.strategies.AdvancedMemberStrategy;
import com.codedancing.designpattern.behavioral.strategy.strategies.PrimaryMemberStrategy;

public class Client {

    public static void main(String[] args) {
        ShoppingContext shoppingContext = new ShoppingContext(new PrimaryMemberStrategy());
        shoppingContext.handle(1000.0);

        shoppingContext.setStrategy(new AdvancedMemberStrategy());
        shoppingContext.handle(1000.0);
    }

}
