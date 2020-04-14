package com.xll.threadtest.customerproducter;

public class ProductFruit extends Thread{

    private Fruit fruit;

    public ProductFruit(Fruit fruit){
        this.fruit = fruit;
    }

    @Override
    public void run() {

        synchronized (fruit) {
            while (true) {
                if (!fruit.isExists()) {
                    fruit.setExists(true);
                    System.out.println("生产了一个" + fruit.getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    fruit.notify();
                } else {
                    try {
                        fruit.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
