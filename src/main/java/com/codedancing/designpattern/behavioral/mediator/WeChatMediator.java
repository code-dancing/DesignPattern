package com.codedancing.designpattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;


/**
 * 具体中介者
 */
public class WeChatMediator implements Mediator {

    private List<AbstractColleague> colleagues = new ArrayList<>();

    @Override
    public void register(AbstractColleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(AbstractColleague colleague) {
        AbstractColleague.Message message = colleague.getMessage();
        colleagues.forEach(aColleague -> {
            if (aColleague.getUsername().equals(message.getReceiver())) {
                aColleague.receive(message);
            }
        });
    }

}
