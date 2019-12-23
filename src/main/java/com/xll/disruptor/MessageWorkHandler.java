package com.xll.disruptor;

import com.lmax.disruptor.WorkHandler;

public class MessageWorkHandler implements WorkHandler<MessageEvent> {
    @Override
    public void onEvent(MessageEvent messageEvent) throws Exception {
        System.out.println(System.currentTimeMillis()+"--WorkHandler-----我是消费者----------"+messageEvent.getMessage());
    }
}
