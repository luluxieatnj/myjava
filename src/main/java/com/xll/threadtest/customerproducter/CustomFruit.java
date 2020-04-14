package com.xll.threadtest.customerproducter;

public class CustomFruit extends Thread {
    private Fruit fruit;

    public CustomFruit(Fruit fruit){
        this.fruit = fruit;
    }

    @Override
    public void run() {
        synchronized (fruit) {
            while (true) {

                if (fruit.isExists()) {
                    fruit.setExists(false);
                    System.out.println("消费了一个" + fruit.getName());

                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    fruit.notify();
                }

                try {
                    fruit.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
