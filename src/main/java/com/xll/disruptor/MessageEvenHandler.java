package com.xll.disruptor;

import com.lmax.disruptor.EventHandler;

public class MessageEvenHandler implements EventHandler<MessageEvent> {
    @Override
    public void onEvent(MessageEvent messageEvent, long l, boolean b) throws Exception {
        System.out.println("单一生产者---- " + messageEvent.getMessage());
    }
}
