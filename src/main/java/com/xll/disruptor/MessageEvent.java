package com.xll.disruptor;

/**
 *  消息对象
 */
public class MessageEvent<T> {

    private T message;

    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }
}
