package com.xll.disruptor;

import com.lmax.disruptor.EventFactory;

/**
 *  消息工厂，生产消息
 */
public class MessageEventFactory implements EventFactory<MessageEvent> {

    @Override
    public MessageEvent newInstance() {
        return new MessageEvent();
    }
}
